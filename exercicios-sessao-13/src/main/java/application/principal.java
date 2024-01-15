package application;

import modelEntities.Cliente;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dataSimples = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com os dados do cliente:");
        System.out.println("Nome: ");
        scanner.next();
        String nome = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Data nascimento: ");
        Date dataNascimento = dataSimples.parse(scanner.next());

        System.out.print("Entre com os dados do pedido:");
        String status = scanner.next();

        Cliente cliente = new Cliente(nome,email,dataNascimento);

        System.out.print("Entre com os dados do pedido");

        System.out.println("Informe quantos itens estão no pedido: ");
        Integer quantidadePedidos = scanner.nextInt();

        for (int i =1 ; i <= quantidadePedidos ; i++){
            System.out.print("Entre com o #" + i + " dados do item: ");
            System.out.println(");
        }
    }
}
