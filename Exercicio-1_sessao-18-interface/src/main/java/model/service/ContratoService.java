package model.service;

import model.entities.Contrato;
import model.entities.Parcelamento;


import java.util.ArrayList;

public class ContratoService {

    PagamentoOnlineService pagamentoOnlineService;
    Parcelamento parcelamento;

    public ContratoService(PagamentoOnlineService pagamentoOnlineService){
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processarContrato (Contrato contrato, Integer meses){
        double valorBaseParcela = contrato.getValor() / meses;
        double valorJuros ;
        double valorTarifa;
        double valorTotal ;
        for (int i = 1 ; i <= meses ; i++){
            valorJuros  = pagamentoOnlineService.juros(valorBaseParcela,i);
            valorTarifa = pagamentoOnlineService.tarifa(valorJuros + valorBaseParcela);
            valorTotal = valorBaseParcela + valorJuros + valorTarifa;

            parcelamento = new Parcelamento(contrato.getData().plusMonths(i),valorTotal);
            contrato.getParcelamento().add(parcelamento);
        }
    }


}
