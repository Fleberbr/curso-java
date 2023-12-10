package Program;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;


public class Exercicio_estaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.println("Qual o valor do dolar atual: ");
		double precoDolar = sc.nextDouble();
		
		System.out.println("Quando deseja em dolar ?");
		double vlDolarReceber = sc.nextDouble();
		
		
		double valorApagar = CurrencyConverter.calculoConversao(precoDolar, vlDolarReceber);
		System.out.printf("Valor total a pagar %.2f",valorApagar);
		
		
		
	}

}
