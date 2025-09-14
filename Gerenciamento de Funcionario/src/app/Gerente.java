package app;

public class Gerente extends Funcionario implements Bonificacao{
    private double bonusGerencial;

    public Gerente(String nome, double salario, double bonusGerencial){
        super(nome,salario);
        this.bonusGerencial = bonusGerencial;
    }

    @Override
    public double calcularSalario(){
        return salario + bonusGerencial;
    }
    @Override 
    public double calcularBonus(){
        return salario * 0.20;
    }
}
