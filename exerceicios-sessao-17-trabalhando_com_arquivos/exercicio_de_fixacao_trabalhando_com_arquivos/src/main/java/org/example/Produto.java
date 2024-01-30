package org.example;

public class Produto {

    private String nome;
    private Double valor;
    private int quantidade;

    public Produto(){}
    public Produto(String nome, Double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double calcularTotal(){
        return getQuantidade() * getValor();
    }

    @Override
    public String toString() {
        return nome + "," +
               String.format("%.2f",valor)+ "," +
               quantidade + "," +
               String.format("%.2f",calcularTotal());
    }
}
