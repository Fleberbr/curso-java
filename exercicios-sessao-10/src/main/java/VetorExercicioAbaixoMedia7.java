import java.util.Scanner;

public class VetorExercicioAbaixoMedia7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números quer digitar ? ");
        int tamanhoVetor = scanner.nextInt();
        double[] vetor = new double[tamanhoVetor];

        double mediaValores;
        double soma = 0.0;
        int posicaoMaiorValor = 0 ;
        vetor[0] = 0;

        for (int i = 0 ; i < vetor.length;i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        mediaValores = soma / vetor.length;

        System.out.println();
        System.out.printf("MEDIA DO VETOR %.3f %n",mediaValores);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (int i = 0 ; i < vetor.length;i++){
            if ( vetor[i] < mediaValores){
                System.out.println(vetor[i]);
            };
        }
    }
}