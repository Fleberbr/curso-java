package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
    private Date dataFabricacao;
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado(){}
    public ProdutoUsado(String nome, Double price, Date dataProducao) {
        super(nome, price);
        this.dataFabricacao = dataProducao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String priceTag() {
        return getNome() + " (Usado) $ " + String.format("%.2f", getPreco()) + " (Data de fabricacao: "+ formatador.format(dataFabricacao) +")";
    }
}
