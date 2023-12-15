import java.util.Scanner;

public class VetorExercicioPensionista12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //vetor de 10 fixo, por que são 10 quartos
        Integer[] vQuarto = new Integer[10];
        String[] vEmailPensionista = new String[10];
        String[] vNomePensionista = new String[10];

        System.out.print("Quantos estudantes entrarão nos quartos ?");
        int quantidadeNumeros = scanner.nextInt();
        for (int i = 1; i <= quantidadeNumeros ; i++){

            System.out.printf("Alugado #%d %n",i);

            System.out.print("Nome:");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Email:");
            String email = scanner.next();

            System.out.print("Quarto:");
            Integer quarto = scanner.nextInt();
            System.out.println();

            vQuarto[quarto] = quarto ;
            vNomePensionista[quarto] = nome;
            vEmailPensionista[quarto] = email;
        }

        System.out.print("Quartos ocupados:");
        System.out.println();
        for (int i = 0; i < vQuarto.length; i++){
            if(vQuarto[i] != null){
                System.out.printf("%d: %s, %s %n",vQuarto[i],vNomePensionista[i],vEmailPensionista[i]);

            }
        }

    }

}
