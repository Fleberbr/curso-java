import java.util.Scanner;

public class VetorExercicioSomaVetores10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadeNumeros = scanner.nextInt();

        String[] vetorAluno = new String[quantidadeNumeros];
        double[] vetorPrimeiraNota = new double[quantidadeNumeros];
        double[] vetorSegundaNota = new double[quantidadeNumeros];



        for (int i = 0; i < quantidadeNumeros ; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %sº aluno: %n",i+1);
            vetorAluno[i] = scanner.next();
            vetorPrimeiraNota[i] = scanner.nextDouble();
            vetorSegundaNota[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < quantidadeNumeros ; i++){
            if (6.0 <= (vetorPrimeiraNota[i] + vetorSegundaNota[i])/2)
            System.out.println(vetorAluno[i]);

        }
    }
}
