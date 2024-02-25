package application;

import model.entities.Contrato;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Contrato contrat = new Contrato(8028, LocalDate.parse("25/06/2018",format),600);
        Integer numeroParcelas = 3;



    }
}