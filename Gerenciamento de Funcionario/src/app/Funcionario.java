package app;
public abstract class Funcionario{
    protected String nome;
    protected double salario;

public Funcionario(String nome, double salario){
    this.nome = nome;
    this.salario = salario;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + nome + "Salario: " + salario);
    }
    public abstract double calcularSalario();
}