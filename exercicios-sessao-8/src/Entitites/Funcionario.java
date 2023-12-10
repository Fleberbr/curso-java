package Entitites;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public double aumentoSalario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem / 100;
	}
	
}
