import java.util.Scanner;

import entities.Produto;

public class VetorObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor de produtos: ");
		int tamanhoVetor = scanner.nextInt();
		Produto[] vetor = new Produto[tamanhoVetor];
		
		for (int i = 0; i < tamanhoVetor; i++) {
			scanner.nextLine();
			String nome = scanner.next();
			double preco = scanner.nextDouble();
			vetor[i] = new Produto(nome,preco);
		}
				
		double soma = 0.0;
		for (int i = 0; i < tamanhoVetor; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / tamanhoVetor;
		
		System.out.printf("Média dos valores : %.2f",media);
		
		scanner.close();
	}

}
