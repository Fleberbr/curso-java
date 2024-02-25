package model.service;

public interface PagamentoOnlineService {

    double tarifa(Double montante);
    double juros (Double montante,Integer meses);
}
