package com.diegoardila.calculadora;

import java.math.BigDecimal;
import java.math.MathContext;

/** Lógica decimal independiente de Android, sin separadores de miles. */
public final class Calculadora {
    public enum Operacion { SUMA, RESTA, MULTIPLICACION, DIVISION }

    private Calculadora() { }

    public static BigDecimal leerNumero(String texto) {
        String valor = texto == null ? "" : texto.trim();
        if (!valor.matches("[+-]?(?:[0-9]+(?:[.,][0-9]*)?|[.,][0-9]+)")) {
            throw new IllegalArgumentException("Número inválido");
        }
        return new BigDecimal(valor.replace(',', '.'));
    }

    public static String calcular(BigDecimal a, BigDecimal b, Operacion operacion) {
        BigDecimal resultado;
        switch (operacion) {
            case SUMA: resultado = a.add(b); break;
            case RESTA: resultado = a.subtract(b); break;
            case MULTIPLICACION: resultado = a.multiply(b); break;
            case DIVISION:
                if (b.signum() == 0) throw new ArithmeticException("División entre cero");
                resultado = a.divide(b, MathContext.DECIMAL64);
                break;
            default: throw new IllegalArgumentException("Operación inválida");
        }
        return resultado.stripTrailingZeros().toPlainString().replace('.', ',');
    }
}
