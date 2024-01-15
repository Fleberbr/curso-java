package modelEntities;

import entitiesEnum.OrdemStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pedido {

    private static final SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataPedido ;
    private OrdemStatus status;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(Date dataPedido, OrdemStatus status, Cliente cliente) {
        this.dataPedido = dataPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public OrdemStatus getStatus() {
        return status;
    }
    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItens(ItemPedido itens){
        this.itens.add(itens);
    }
    public void removerItens(ItemPedido itens){
        this.itens.remove(itens);
    }
    public Double Total(){
        double soma = 0.0;
        for (ItemPedido item : itens){
            soma += item.subTotal();
        }
        return soma;
    }
}


