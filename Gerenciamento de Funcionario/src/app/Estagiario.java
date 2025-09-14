package app;


    public class Estagiario extends Funcionario implements Bonificacao {
        protected int horasTrabalhadas;
        protected double valorHora;

    public Estagiario(String nome, double salario, int horasTrabalhadas, double valorHora) {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return salario + (horasTrabalhadas * valorHora);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05; // 5% do salário
    }
}