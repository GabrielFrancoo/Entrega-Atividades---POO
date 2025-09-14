package br.com.gabriel.calculadora;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calc = new Calculadora();

    @Test
    public void testSubtrair() {
        double resultado = calc.subtrair(3, 2);
        assertEquals(1, resultado,0.0001);
    }

    @Test
    public void testSoma(){
        double resultado = calc.somar(4, 4);
        assertEquals(8, resultado,0.0001);
    }

    @Test
    public void testDivisao(){
        double resultado = calc.dividir(10, 2);
        assertEquals(5,resultado,0.0001);
    }
}