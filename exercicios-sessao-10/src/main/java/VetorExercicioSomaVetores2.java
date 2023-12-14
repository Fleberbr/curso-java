
import java.util.Scanner;

public class VetorExercicioSomaVetores2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadePessoas = scanner.nextInt();

        double soma = 0.0 ;

        double[] vetor = new double[quantidadePessoas];


        for (int i = 0; i < vetor.length ; i++){
            System.out.print("Digite um número:");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        double media = soma / quantidadePessoas ;

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length ; i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println();
        System.out.printf("SOMA = %s%n",soma);
        System.out.printf("MEDIA %.2f",media);
    }

}
