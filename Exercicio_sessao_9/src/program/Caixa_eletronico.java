package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Caixa_eletronico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double saldoEmConta = 0.0;
		Conta conta ;
		
		
		System.out.print("Digite o número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.print("Digite o seu nome:");
		String nomeCliente = scanner.next();
		
		
		System.out.println("Deseja realizar um deposito inicia: (s/n) ?");
		char opcao = scanner.next().charAt(0);
		
		if ( opcao == 's') {
			System.out.print("Informe o valor a ser depositado:");
			saldoEmConta = scanner.nextDouble();
			
		}
		conta = new Conta(numeroConta,nomeCliente,saldoEmConta);
			
		System.out.println();
		System.out.println("Dados da conta:");
		conta.imprimirSaldo();
		
		System.out.print("Informe o valor do deposito: ");
		conta.realizarDeposito(scanner.nextDouble());
		System.out.println("Atualização do saldo em conta:");
		conta.imprimirSaldo();
		
		System.out.print("informe o valor do saque: ");
		conta.realizarSaque(scanner.nextDouble());
		System.out.println("Atualização do saldo em conta:");
		conta.imprimirSaldo();
		
		 
		
		
	}

	
}
