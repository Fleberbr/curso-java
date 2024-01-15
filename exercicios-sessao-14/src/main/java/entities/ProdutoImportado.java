package entities;

public class ProdutoImportado extends Produto{

    private Double taxaImportacao;

    public ProdutoImportado() {}

    public ProdutoImportado(String nome, Double price, Double taxaImportacao) {
        super(nome, price);
        this.taxaImportacao = taxaImportacao;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public String priceTag() {
        return getNome() + " $ " + String.format("%.2f", precoTotal()) + " (Taxa de importacao: $ "+ String.format("%.2f", taxaImportacao)+ ")";
    }
    public Double precoTotal() {
        return getPreco() + taxaImportacao;
    }
}
