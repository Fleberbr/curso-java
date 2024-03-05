package application;

import model.entities.Contrato;
import model.entities.Parcelamento;
import model.service.ContratoService;
import model.service.PaypalService;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Contrato contrato = new Contrato(8028, LocalDate.parse("28/02/2024",format),600);
        Integer numeroParcelas = 3;

        ContratoService contratoService = new ContratoService(new PaypalService());
        contratoService.processarContrato(contrato,numeroParcelas);

        for (Parcelamento parcelamento : contrato.getParcelamento()){
            System.out.println(parcelamento);
        }


    }
}