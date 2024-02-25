package model.entities;

import java.time.LocalDate;

public class Parcelamento {

    private LocalDate data;
    private double valor;

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
}
