package model.entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class AluguelCarro {


    private LocalDateTime dataInicio;
    private LocalDateTime dataFinal;
    private Veiculo vehiculo;
    private Fatura fatura;


    public AluguelCarro(){}
    public AluguelCarro(Veiculo vehiculo, LocalDateTime dataInicio, LocalDateTime dataFinal, Fatura fatura) {
        this.vehiculo = vehiculo;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.fatura = fatura;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }
    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Veiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Veiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public String toString() {
        return "Recebido aluguel carro" +
               "\nValor aluguel: " + String.format("%.2f",fatura.getPagamentoBase()) +
               "\nValor imposto: " + String.format("%.2f",fatura.getImposto()) +
               "\nValor total: " +   String.format("%.2f",fatura.getImposto() + fatura.getPagamentoBase());
    }
}

