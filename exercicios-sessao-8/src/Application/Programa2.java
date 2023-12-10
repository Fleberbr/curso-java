package Application;

import java.util.Locale;
import java.util.Scanner;

import Entitites.Funcionario;

public class Programa2 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.print("Name :");
		func.nome = sc.next();
		
		System.out.print("Salario bruno :");		
		func.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto :");
		func.imposto = sc.nextDouble();
		
		System.out.printf("Funcionario : %s, $ %.2f\n\n",func.nome,func.salarioLiquido() );
		
		System.out.print("Qual o percentual de aumento salarial? ");
		func.aumentoSalario(sc.nextDouble());
		
		System.out.printf("\nDado atualizado: %s, $ %.2f",func.nome,func.salarioLiquido());
		
		
		
	}

}
