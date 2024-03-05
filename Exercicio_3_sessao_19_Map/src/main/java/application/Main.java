package org.example;

import model.entities.Produto;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Produto, Double> mapEstoque = new HashMap<>();
        Produto produto;

        /*Produto p1 = new Produto("Tv", 900.0);
        Produto p2 = new Produto("Notebook", 1200.0);
        Produto p3 = new Produto("Tablet", 400.0);

        mapEstoque.put(p1, 10000.0);
        mapEstoque.put(p2, 20000.0);
        mapEstoque.put(p3, 15000.0);*/

        mapEstoque.put(new Produto("Tv", 900.0),10000.0);
        mapEstoque.put(new Produto("Notebook", 1200.0),20000.0);
        mapEstoque.put(new Produto("Tablet", 400.0),15000.0);

        Produto produtoKey = new Produto("Tv", 900.0);


        //Sem o código do HashCod na classe Produto, o java compara os endereços de memória(Ponteiros de memória), por isso o resultado dá falso.
        //Após incluir o método HashCod a comparação do contain dá positiva.
        System.out.println("Contains 'produtoKey' key: " + mapEstoque.containsKey(produtoKey));
    }
}
