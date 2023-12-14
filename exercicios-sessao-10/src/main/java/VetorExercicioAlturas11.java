import java.util.Scanner;

public class VetorExercicioAlturas11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadePessoas = scanner.nextInt();

        double menorAltura = 2.0 ;
        double maiorAltura = 0 ;
        double quantidadeMulher = 0 ;
        double quantidadeHomem = 0 ;
        double soma = 0.0 ;
        double media = 0.0 ;

        double[] vAltura = new double[quantidadePessoas];
        char[] vGenero = new char[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas ; i++){
            System.out.printf("Altura da %sª pessoa: ",i+1);
            vAltura[i] = scanner.nextDouble();
            System.out.printf("Genero da %sª pessoa: ",i+1);
            vGenero[i] = scanner.next().charAt(0);

            if (vGenero[i] == 'F') {
                soma += vAltura[i];
                quantidadeMulher += 1;
            }else {
                quantidadeHomem += 1;
            }

            if (vAltura[i] < menorAltura )
                menorAltura = vAltura[i];
            if (vAltura[i] > maiorAltura)
                maiorAltura = vAltura[i];
        }

            System.out.printf("Menor altura = %.2f %n",menorAltura);

            System.out.printf("Maior altura = %.2f %n",maiorAltura);

            System.out.printf("Media das alturas das mulheres = %.2f %n",soma / quantidadeMulher);

            System.out.printf("Numero de homens %.2f",quantidadeHomem);

    }
}
