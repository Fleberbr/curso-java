package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        String[] vetorLinha ;
        List<Produto> listaProduto = new ArrayList<>();

        //String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "C:\\Users\\elton\\OneDrive\\Documentos\\Projetos programação\\ws-eclipse\\curso-java\\exerceicios-sessao-17-trabalhando_com_arquivos";
        boolean resultado = new File(path + "\\out").mkdir();
        System.out.println((resultado)? "Diretório criado com sucesso" : "Diretório já existe.");

        try {
            resultado = new File(path + "\\out\\summary.csv").createNewFile();
            System.out.println((resultado)? "Arquivo summary criado com sucesso " : "Arquivo já existe");
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\entrada.csv"))) {
            System.out.println("lendo arquivo de entrada");
            String linha = bufferedReader.readLine();
            System.out.println("Escrevendo no arquivo summary");
            while (linha != null) {
                //Aqui cria um vetorLinha e lê o arquivo CSV e quebra em variáveis por indice.
                vetorLinha = linha.split(",");
                String nome = vetorLinha[0];
                Double valor = Double.valueOf(vetorLinha[1]);
                int quantidade = Integer.parseInt(vetorLinha[2]);
                //produto = new Produto(nome,valor,quantidade);

                listaProduto.add(new Produto(nome,valor,quantidade));
                linha = bufferedReader.readLine();
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv",true))) {
                for (Produto produto : listaProduto) {
                    bufferedWriter.write(produto.toString());
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Fim de programa");
    }
}