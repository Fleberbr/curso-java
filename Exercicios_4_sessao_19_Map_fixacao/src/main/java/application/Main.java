package application;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapVotos = new HashMap<>() {};

        System.out.println("Escreva o caminho do arquivo, com o nome do arquivo.extensão: ");
        String path = "C:\\Users\\elton\\OneDrive\\Documentos\\Projetos programação\\ws-eclipse\\curso-java\\Exercicios_4_sessao_19_Map_fixacao\\entrada.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String linha = bufferedReader.readLine();
            while (linha != null) {
                String[] campos = linha.split(",");
                String nome = campos[0];
                int voto = Integer.parseInt(campos[1]);

                if (mapVotos.containsKey(nome)) {
                    int votos = mapVotos.get(nome) + voto;
                    mapVotos.put(nome,votos);
                }
                else{
                    mapVotos.put(nome,voto);
                }
                linha = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String chave : mapVotos.keySet()) {
            System.out.println(chave + ": " + mapVotos.get(chave));
        }

        System.out.println("Good night world!");
        scanner.close();
    }
}