package entities;

public class Produto {

    private String nome;
    private Double price;

    private Produto (){};

    private Produto(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }
    private String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    private Double getPrice() {
        return price;
    }
    private void setPrice(Double price) {
        this.price = price;
    }
}
