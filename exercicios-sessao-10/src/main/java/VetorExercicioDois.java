import java.util.Scanner;

public class VetorExercicioDois {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números quer digitar ? ");
        int tamanhoVetor = scanner.nextInt();
        double soma = 0.0;
        double media ;

        double[] vetor = new double[tamanhoVetor];

        for (int i = 0 ; i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        media = soma/vetor.length;

        System.out.print("VALORES= ");
        for (int i = 0 ; i < vetor.length;i++){
           System.out.print(vetor[i]+" ");
        }
        System.out.println();
        System.out.printf("SOMA: %s%n",soma);
        System.out.println("MEDIA: " +media);
    }
}