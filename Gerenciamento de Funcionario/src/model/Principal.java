package model;

import app.Funcionario;
import app.Gerente;
import app.Estagiario;
import app.Bonificacao;

// ================= Principal.java =================
public class Principal {
    public static void main(String[] args) {
        // Criando objetos
        Funcionario f1 = new Gerente("Carlos ", 5000, 1000);
        Funcionario f2 = new Estagiario("Ana ", 1200, 20, 15);

        // Polimorfismo -> mesma chamada, comportamentos diferentes
        f1.exibirInfo();
        System.out.println("Salário final (Gerente): " + f1.calcularSalario());

        f2.exibirInfo();
        System.out.println("Salário final (Estagiário): " + f2.calcularSalario());

        // Interface Bonificavel
        Bonificacao b1 = (Bonificacao) f1;
        Bonificacao b2 = (Bonificacao) f2;

        System.out.println("Bônus do Gerente: " + b1.calcularBonus());
        System.out.println("Bônus do Estagiário: " + b2.calcularBonus());
    }
}