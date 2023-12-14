import java.util.Scanner;

public class VetorExercicioMediaPares8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números quer digitar ? ");
        int tamanhoVetor = scanner.nextInt();
        int[] vetor = new int[tamanhoVetor];

        double mediaValoresPares;
        double somaPares = 0 ;
        int quantidadePares = 0;
        vetor[0] = 0;

        for (int i = 0 ; i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                quantidadePares += 1;
            }
        }
        mediaValoresPares = somaPares / quantidadePares ;
        if (quantidadePares != 0) {
            System.out.print("MEDIA DOS PARES = " + mediaValoresPares);
        }else {
           System.out.print("NENHUM NUMERO PAR");
        }
    }
}