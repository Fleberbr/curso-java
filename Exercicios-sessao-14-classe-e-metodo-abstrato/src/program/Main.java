package program;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaContribuinte = new ArrayList<>();

        System.out.print("Entre com a quantidade de contribuinte(s): ");
        int quantidadeContribuinte = scanner.nextInt();

        for (int i = 1 ; i <= quantidadeContribuinte ; i++){
            System.out.println("Dado contribuinte #" + i);
            System.out.print("Individual ou Empresa (e/i): ");
            char tipoProduto = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("RendaAnual: ");
            Double rendaAnual = scanner.nextDouble();

             if(tipoProduto == 'i'){
                System.out.print("Despesa saude: ");
                Double despesaSaude = scanner.nextDouble();
                listaContribuinte.add(new PessoaFisica(nome,rendaAnual,despesaSaude));

            }else if(tipoProduto == 'e') {
                System.out.print("Quantidade de funcionarios: ");
                Integer quantidadefuncionario = scanner.nextInt();
                listaContribuinte.add(new PessoaJuridica(nome,rendaAnual,quantidadefuncionario));
            }
        }

        for (Pessoa lista : listaContribuinte) {
            System.out.printf("%s: $ %.2f%n", lista.getNome(), lista.calcularImpostaRenda());
        }

        Double somaImpostoPago = 0.0 ;
        for (Pessoa lista : listaContribuinte) {
            somaImpostoPago += lista.calcularImpostaRenda();
        }
        System.out.printf("TOTAL IMPOSTO: $" + String.format("%.2f",somaImpostoPago));
        scanner.close();
    }
}