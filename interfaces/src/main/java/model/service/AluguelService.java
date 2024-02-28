package model.service;

import model.entities.AluguelCarro;
import model.entities.Fatura;
import java.time.Duration;

public class AluguelService {

    private Double precoPorHora;
    private Double precoPorDia;
    private ImpostoService impostoService;

    public AluguelService(Double precoPorHora, Double precoPorDia, ImpostoService impostoService) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.impostoService = impostoService; //A classe aluguel service não sabe qual será o serviço de imposto, quem sabe é quem está chamando o serviço de aluguel.
    }

    public Double getPrecoPorHora() {
        return precoPorHora;
    }
    public void setPrecoPorHora(Double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }
    public Double getPrecoPorDia() {
        return precoPorDia;
    }
    public void setPrecoPorDia(Double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }


    public void  processarFatura (AluguelCarro aluguelCarro){
        double minutos = Duration.between(aluguelCarro.getDataInicio(),aluguelCarro.getDataFinal()).toMinutes();
        double horas = minutos / 60.0 ;
        double dias = horas / 24.0 ;

        double valorAluguel;
        if (horas <= 12.0){
            valorAluguel = getPrecoPorHora() * Math.ceil(horas);
        }
        else {
            valorAluguel = getPrecoPorDia() * Math.ceil(dias);
        }

        double imposto = impostoService.imposto(valorAluguel);
        aluguelCarro.setFatura(new Fatura(valorAluguel,imposto));
    }
}
