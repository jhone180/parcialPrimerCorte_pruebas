package com.example.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicacionTest {

    @Test
    public void multiplicacionTest() {

        int testResultado1 = 260;
        int testResultado2 = 31068;

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicacion(52, 5);
        assertEquals(testResultado1, resultado);

        resultado = calculadora.multiplicacion(2589, 12);
        assertEquals(testResultado2, resultado);

    }

}
