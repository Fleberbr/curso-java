import java.util.Scanner;

public class VetorExercicioNegativos1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números quer digitar ? ");
        int tamanhoVetor = scanner.nextInt();

        int[] vetor = new int[tamanhoVetor];

        for (int i = 0 ; i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int i = 0 ; i < vetor.length;i++){
            if (vetor[i] < 0)
                System.out.println(vetor[i]);
        }


    }
}