package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contrato {

    private int numero;
    private LocalDate data;
    private double valor;
    ArrayList<Parcelamento> parcelamento = new ArrayList<Parcelamento>();


    public Contrato(int numero, LocalDate data, double valor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.parcelamento = parcelamento;
    }

    public int getNumero() {
        return numero;
    }
    public LocalDate getData() {
        return data;
    }
    public double getValor() {
        return valor;
    }
    public ArrayList<Parcelamento> getParcelamento() {
        return parcelamento;
    }
    
}
