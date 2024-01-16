package model.entitites;

import model.exceptions.DomainException;

public class Account {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Account(){}
    public Account(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public Double getLimiteSaque() {
        return limiteSaque;
    }
    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito (Double quantidade)  {
        this.saldo += quantidade;
    }
    public void saque (Double quantidade) throws DomainException {
        if (saldo <= 0) {
            throw new DomainException("Saldo insuficiente para saque");
        }else if (quantidade > limiteSaque){
            throw new DomainException("Valor para saque superior ao valor limite");
        }else{
            saldo -= quantidade;
        }
    }

}
