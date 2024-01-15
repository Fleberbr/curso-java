package program;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;


import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a quantidade de produtos: ");
        Integer quantidadesProdutos = scanner.nextInt();
        List<Produto> listaProduto = new ArrayList<>();


        for (int i = 1 ; i <=quantidadesProdutos ; i++){
            System.out.println("Dado produto #" + i);
            System.out.print("Produto comum, usado ou improtado (c/u/i): ");
            char tipoProduto = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Preco: ");
            Double preco = scanner.nextDouble();

            if (tipoProduto == 'c'){
                listaProduto.add(new Produto(nome,preco));

            }else if(tipoProduto == 'i'){
                System.out.print("Taxa de importacao: ");
                Double taxaImportacao = scanner.nextDouble();
                listaProduto.add(new ProdutoImportado(nome,preco,taxaImportacao));

            }else if(tipoProduto == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                Date data = formatar.parse(scanner.next());
                listaProduto.add(new ProdutoUsado(nome,preco,data));
            }

        }
        for (Produto lista : listaProduto) {
            System.out.println(lista.priceTag());
        }
   }
}