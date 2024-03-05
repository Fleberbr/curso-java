package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Integer quantidade ;
        Set<Integer> setListaAluno = new HashSet<>();

        System.out.print("Quantos estudantes estão no curso A ?");
        quantidade = scanner.nextInt();
        for (int i = 0; i < quantidade ; i++){
            setListaAluno.add(scanner.nextInt());
        }

        System.out.print("Quantos estudantes estão no curso B ?");
        quantidade = scanner.nextInt();
        for (int i = 0; i < quantidade ; i++){
            setListaAluno.add(scanner.nextInt());
        }

        System.out.print("Quantos estudantes estão no curso C ?");
        quantidade = scanner.nextInt();
        for (int i = 0; i < quantidade ; i++){
            setListaAluno.add(scanner.nextInt());
        }

        System.out.printf("Total de estudantes: "+ setListaAluno.size());



    }

}