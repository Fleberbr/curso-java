import java.util.Scanner;

public class VetorExercicioAlturas9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantidadePessoas = scanner.nextInt();
        String nomePessoaMaisVelha = null;
        int idadePessoaMaisVelha =0 ;

        Pessoa[] vetor = new Pessoa[quantidadePessoas];

        for (int i = 0; i < vetor.length ; i++){
            System.out.printf("Dados da %sª pessoa%n",i+1);
            System.out.print("Nome:");
            String nome = scanner.next();
            System.out.print("Idade:");
            Integer idade = scanner.nextInt();

            vetor[i] = new Pessoa(nome,idade);

            if (vetor[i].getIdade() > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = vetor[i].getIdade();
                nomePessoaMaisVelha = vetor[i].getNome();
            }
        }
        System.out.print("PESSOA MAIS VELHA: "+ nomePessoaMaisVelha);
    }
}
