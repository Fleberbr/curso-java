import java.util.Scanner;

public class VetorExercicioMaiorPosicao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números quer digitar ? ");
        int tamanhoVetor = scanner.nextInt();
        double[] vetor = new double[tamanhoVetor];
        double maiorValor = 0;
        int posicaoMaiorValor = 0 ;
        vetor[0] = 0;

        for (int i = 0 ; i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }
        System.out.println();
        System.out.printf("MAIOR VALOR= %s%n",maiorValor);
        System.out.print("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
    }
}