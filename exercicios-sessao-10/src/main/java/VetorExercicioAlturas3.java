import java.util.Scanner;

public class VetorExercicioAlturas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadePessoas = scanner.nextInt();
        double quantidadeMenorIdade = 0 ;
        double soma = 0.0 ;

        Pessoa[] vetor = new Pessoa[quantidadePessoas];

        for (int i = 0; i < vetor.length ; i++){
            System.out.printf("Dados da %sª pessoa%n",i+1);
            System.out.print("Nome:");
            String nome = scanner.next();
            System.out.print("Idade:");
            Integer idade = scanner.nextInt();
            System.out.print("Altura:");
            double altura = scanner.nextDouble();

            vetor[i] = new Pessoa(nome,idade,altura);
            soma += vetor[i].getAltura();

            if (vetor[i].getIdade() < 16 ){
                quantidadeMenorIdade += 1;
            }
        }

        double media = soma / quantidadePessoas ;

        System.out.printf("Altura média: %.2f%n",media);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%n",quantidadeMenorIdade/quantidadePessoas*100);

        for (int i = 0; i < vetor.length ; i++){
            if (vetor[i].getIdade() < 16 ){
                System.out.println(vetor[i].getNome());
            }
        }
    }
}
