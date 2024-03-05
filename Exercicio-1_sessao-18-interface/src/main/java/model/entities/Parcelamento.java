package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate data;
    private double valor;

    public Parcelamento(){}
    public Parcelamento(LocalDate data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return data.format(format) + " - " + String.format("%.2f",valor);
    }
}
