package com.diegoardila.calculadora;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private String operar(String a, String b, Calculadora.Operacion op) {
        return Calculadora.calcular(Calculadora.leerNumero(a), Calculadora.leerNumero(b), op);
    }

    @Test public void sumaDecimalExacta() {
        assertEquals("0,3", operar("0.1", "0,2", Calculadora.Operacion.SUMA));
    }
    @Test public void restaConNegativos() {
        assertEquals("-3,5", operar("-2", "1.5", Calculadora.Operacion.RESTA));
    }
    @Test public void multiplicacionConSignos() {
        assertEquals("5", operar("-2,5", "-2", Calculadora.Operacion.MULTIPLICACION));
    }
    @Test public void divisionExacta() {
        assertEquals("2,5", operar("5", "2", Calculadora.Operacion.DIVISION));
    }
    @Test public void divisionPeriodicaRedondeada() {
        assertEquals("0,3333333333333333", operar("1", "3", Calculadora.Operacion.DIVISION));
    }
    @Test public void ceroNormalizado() {
        assertEquals("0", operar("-0,00", "0", Calculadora.Operacion.SUMA));
    }
    @Test public void rechazaCerosEnDivision() {
        for (String cero : new String[]{"0", "-0,00", "0.0"}) {
            assertThrows(ArithmeticException.class, () -> operar("8", cero, Calculadora.Operacion.DIVISION));
        }
    }
    @Test public void rechazaFormatosInvalidos() {
        for (String valor : new String[]{"", " ", "-", ".", "1,2.3", "1 000", "1,000,000", "NaN", "1e3", "--2"}) {
            assertThrows(IllegalArgumentException.class, () -> Calculadora.leerNumero(valor));
        }
        assertThrows(IllegalArgumentException.class, () -> Calculadora.leerNumero(null));
    }
    @Test public void admiteComaPuntoYEspaciosExteriores() {
        assertEquals(new BigDecimal("-12.5"), Calculadora.leerNumero(" -12,5 "));
        assertEquals(new BigDecimal("0.5"), Calculadora.leerNumero("+.5"));
        assertEquals(new BigDecimal("1.000"), Calculadora.leerNumero("1,000"));
    }
}
