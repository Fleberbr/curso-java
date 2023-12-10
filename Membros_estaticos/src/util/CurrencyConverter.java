package util;


public class CurrencyConverter {

	public static final double imposto = 0.06 ;
	
	public static double calculoConversao(double valorDolarAtual, double valor) {
		return (valorDolarAtual * valor ) + (valorDolarAtual * valor )* imposto;
	}
}
