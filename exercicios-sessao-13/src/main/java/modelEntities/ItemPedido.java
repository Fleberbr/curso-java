package entities;

public class ItemPedido {

    private Integer quantidade;
    private Double price;
    private Produto produto;

    private ItemPedido(){};

    private ItemPedido(Integer quantidade, Double price, Produto produto){
        this.quantidade = quantidade;
        this.price = price;
        this.produto = produto;
    };

    private Integer getQuantidade() {
        return quantidade;
    }
    private void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    private Produto getProduto() {
        return produto;
    }

    private void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal (){
         return quantidade * price;
    };


    public String toString() {
        return produto.
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantidade +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
