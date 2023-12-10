package Application;

import java.util.Locale;
import java.util.Scanner;

import Entitites.Estudante;

public class Programa3 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante est = new Estudante();
		double resultado;
		
		est.nome = sc.nextLine();
		est.nota1 = sc.nextDouble();
		est.nota2 = sc.nextDouble();
		est.nota3 = sc.nextDouble();
		
		
		System.out.printf("Resultado final = %.2f%n",est.calculoNotaFinal());
		est.consultarAprovacao();	
	}
}
