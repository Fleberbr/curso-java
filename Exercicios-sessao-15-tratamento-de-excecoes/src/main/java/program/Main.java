package program;

import model.entitites.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UnknownFormatConversionException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Entre com os dados da conta");
            System.out.print("Número: ");
            Integer numero = scanner.nextInt();
            System.out.print("Titular: ");
            scanner.next();
            String titular = scanner.nextLine();

            System.out.print("Saldo inicial: ");
            Double saldo = scanner.nextDouble();
            System.out.print("Limite de saque: ");
            Double limiteSaque = scanner.nextDouble();

            Account conta = new Account(numero,titular,saldo,limiteSaque);

            System.out.print("Informe o valor do saque: ");
            conta.saque(scanner.nextDouble());
            System.out.print("Novo saldo: " + String.format("%.2f",conta.getSaldo()));

        } catch (DomainException e) {
            System.out.print(e.getMessage());
        } catch (InputMismatchException e){
            System.out.print("Atenção, o campo esperava um número e foi digitado uma letra "+ e.getMessage());
        }
    }
}