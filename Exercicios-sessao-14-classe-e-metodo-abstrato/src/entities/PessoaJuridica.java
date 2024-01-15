package entities;

public class PessoaJuridica extends Pessoa{

    private Integer quantidadeFuncionario;

    public PessoaJuridica(){
        super();
    }
    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
        super(nome, rendaAnual);
        this.quantidadeFuncionario = numeroFuncionario;
    }


    public Integer getNumeroFuncionario() {
        return quantidadeFuncionario;
    }

    public void setNumeroFuncionario(Integer numeroFuncionario) {
        this.quantidadeFuncionario = numeroFuncionario;
    }

    @Override
    public double calcularImpostaRenda() {
        return (quantidadeFuncionario < 11) ? getRendaAnual() * 0.16 : getRendaAnual() * 0.14 ;
        /*if (quantidadeFuncionario < 11){
            return getRendaAnual() * 0.16;
        }else {
            return getRendaAnual() * 0.14;
        }*/
    }
}
