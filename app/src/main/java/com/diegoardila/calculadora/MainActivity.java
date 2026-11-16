package com.diegoardila.calculadora;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    private EditText primero;
    private EditText segundo;
    private TextView resultado;
    private static final String ESTADO_RESULTADO = "resultado";

    @Override
    protected void onCreate(Bundle estado) {
        super.onCreate(estado);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (vista, insets) -> {
            Insets barras = insets.getInsets(WindowInsetsCompat.Type.systemBars()
                    | WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.ime());
            vista.setPadding(barras.left, barras.top, barras.right, barras.bottom);
            return insets;
        });
        ViewCompat.requestApplyInsets(findViewById(R.id.main));
        primero = findViewById(R.id.numero_uno);
        segundo = findViewById(R.id.numero_dos);
        resultado = findViewById(R.id.resultado);
        if (estado != null) resultado.setText(estado.getCharSequence(ESTADO_RESULTADO,
                getString(R.string.resultado_inicial)));

        findViewById(R.id.sumar).setOnClickListener(v -> operar(Calculadora.Operacion.SUMA));
        findViewById(R.id.restar).setOnClickListener(v -> operar(Calculadora.Operacion.RESTA));
        findViewById(R.id.multiplicar).setOnClickListener(v -> operar(Calculadora.Operacion.MULTIPLICACION));
        findViewById(R.id.dividir).setOnClickListener(v -> operar(Calculadora.Operacion.DIVISION));
        findViewById(R.id.limpiar).setOnClickListener(v -> {
            primero.setText("");
            segundo.setText("");
            primero.setError(null);
            segundo.setError(null);
            resultado.setText(R.string.resultado_inicial);
            primero.requestFocus();
        });
    }

    private BigDecimal validar(EditText campo) {
        campo.setError(null);
        if (campo.getText().toString().trim().isEmpty()) {
            campo.setError(getString(R.string.error_vacio));
            return null;
        }
        try {
            return Calculadora.leerNumero(campo.getText().toString());
        } catch (IllegalArgumentException e) {
            campo.setError(getString(R.string.error_numero));
            return null;
        }
    }

    private void operar(Calculadora.Operacion operacion) {
        BigDecimal a = validar(primero);
        BigDecimal b = validar(segundo);
        if (a == null || b == null) {
            resultado.setText(R.string.error_revision);
            (a == null ? primero : segundo).requestFocus();
            return;
        }
        try {
            resultado.setText(getString(R.string.resultado_formato, Calculadora.calcular(a, b, operacion)));
        } catch (ArithmeticException e) {
            segundo.setError(getString(R.string.error_cero));
            resultado.setText(R.string.error_cero);
            segundo.requestFocus();
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle estado) {
        estado.putCharSequence(ESTADO_RESULTADO, resultado.getText());
        super.onSaveInstanceState(estado);
        // Los EditText con ID conservan automáticamente su texto y selección.
    }
}
