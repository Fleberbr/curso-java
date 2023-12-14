import java.util.Scanner;

public class VetorExercicioSomaVetores6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadeNumeros = scanner.nextInt();

        int[] vetorA = new int[quantidadeNumeros];
        int[] vetorB = new int[quantidadeNumeros];
        int[] vetorC = new int[quantidadeNumeros];

        System.out.print("Digite os valores do vetor A: ");
        System.out.println();
        for (int i = 0; i < quantidadeNumeros ; i++){
            vetorA[i] = scanner.nextInt();
        }


        System.out.print("Digite os valores do vetor B: ");
        System.out.println();
        for (int i = 0; i < quantidadeNumeros ; i++){
            vetorB[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < quantidadeNumeros ; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

    }

}
