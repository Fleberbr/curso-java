import java.util.Iterator;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int tamanhoVetor = scanner.nextInt();
		double[] vetor = new double[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.print("Escreva um número: ");
			vetor[i] = scanner.nextInt();
		}
		
		double soma = 0.0;
		for (int i = 0; i < tamanhoVetor; i++) {
			soma += vetor[i];
		}
		
		double media = soma / tamanhoVetor;
		
		System.out.printf("Média dos valores : %.2f",media);
		
		scanner.close();		
	}
}
