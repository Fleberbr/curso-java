package application;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //TreeMap Ordem as chaves
        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","Maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "88844484");// Map não admite repetições de chave, portanto o Map substitui o valor

        System.out.println("Map contem a chave 'phone' ? " + cookies.containsKey("phone"));
        System.out.println("Número phone: "+ cookies.get("phone")); //usado para pegar o valor da chave.

        //se tentar pegar uma chave que não existe retorna nulo
        System.out.println("Email: "+ cookies.get("email"));
        System.out.println("username: "+ cookies.get("username"));

        //Pegar o tamanho do Map.
        System.out.println("Size do Map: " + cookies.size());

        System.out.println("All cookies");

        //KeySet retorna 1 set com a chave key
        for (String chave : cookies.keySet()) {
            System.out.println(chave + ": " + cookies.get(chave));
        }
    }
}