import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExerciciosFixacao {
    public static void main(String[] args) {

        List<Funcionario> listaFuncionario = new ArrayList<>();
        Funcionario funcionario ;
        Integer id;
        String nome;
        Double salario;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quando empregados serão registrados ? ");
        Integer quantidadeFuncionarios = scanner.nextInt();

        for (int i = 0; i < quantidadeFuncionarios ; i++){
            System.out.println();
            System.out.printf("Funcionário #%d",i+1);
            System.out.println();
            System.out.print("ID: ");
            id = scanner.nextInt();
            while (existeId(listaFuncionario,id)){

                System.out.println();
                System.out.println("Identificador em uso, informe um outro identificador;");
                System.out.print("ID: ");
                id = scanner.nextInt();
            }
            System.out.print("Nome: ");
            scanner.nextLine();
            nome = scanner.nextLine();
            System.out.print("Salario: ");
            salario = scanner.nextDouble();

            listaFuncionario.add(new Funcionario(id,nome,salario));
        }
        //Aumento salarial
        System.out.println();
        System.out.print("Entre com o ID do funcionario que receberá o aumento: ");
        int identificador = scanner.nextInt();


        funcionario = listaFuncionario.stream().filter(lista -> lista.getId() == identificador).findFirst().orElse(null);
        if (funcionario != null) {
            System.out.print("Entre com o percentual de aumento:");
            Double percentualAumentoSalario = scanner.nextDouble();
            funcionario.aumentoSario(percentualAumentoSalario);

        }else{
            System.out.println();
            System.out.print("Esse ID informado não existe.");
        }
        System.out.println();
        System.out.println("Lista de funcionarios:");

        //Assim que se apresenta a lista, lembrar do método ToString da classe funcionário.
        for (Funcionario listaDeFuncionarios: listaFuncionario) {
            System.out.println(listaDeFuncionarios);

        }
        scanner.close();
    }


    public static boolean existeId(List<Funcionario> list, int identificao){
        Funcionario funcionario = list.stream().filter(x -> x.getId() == identificao).findFirst().orElse(null);
        //System.out.println(funcionario);
        //boolean resultado = funcionario != null;
        //return resultado ;
        return funcionario != null ;
    }
}
