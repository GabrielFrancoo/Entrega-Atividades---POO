package br.com.gabriel.calculadora;

public class Calculadora {
    public double somar(double a, double b){
        return a + b;
    }
    public double subtrair(double a, double b){
        return a - b;
    }
    public double dividir(double a, double b){
        return a / b;
    }
    public double multiplicar(double a, double b){
        return a * b;
    }

    public double calcular(double a, double b, char operador){
        switch (operador){
            case '+':
                return somar(a, b);
            case '-':
                return subtrair(a, b);
            case '*':
                return multiplicar(a, b);
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida!"); 
                }
                return dividir(a, b);
                default:
                    throw new IllegalArgumentException("Operador inválido: " + operador);

        }
    }
}