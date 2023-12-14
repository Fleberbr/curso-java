import java.util.Scanner;

public class VetorExercicioNumerosPares4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas numeros serão digitadas? ");
        int quantidadePessoas = scanner.nextInt();

        int[] vetor = new int[quantidadePessoas];
        Integer idade;

        for (int i = 0; i < vetor.length ; i++){
            System.out.printf("Digite um número: ");
            vetor [i]= scanner.nextInt();
        }
        int quantidadePares = 0;

        System.out.println("Números pares:");

        for (int i = 0; i < vetor.length ; i++){
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] +" ");
                quantidadePares += 1;
            }
        }
        System.out.println();
        System.out.print("Quantidade de pares = " + quantidadePares);
    }
}
