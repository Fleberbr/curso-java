package model.service;

public class PaypalService implements PagamentoOnlineService{

    @Override
    public double tarifa(Double montante) {
        return montante * 2 /100;
    }

    @Override
    public double juros(Double parcela, Integer meses) {
       return parcela * meses / 100;
    }
}
