package entities;

public class PessoaFisica extends Pessoa{

    private Double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcularImpostaRenda() {
       return (getRendaAnual() < 20000) ? getRendaAnual() * 0.15 - calcularDescontoGastoSaude(): getRendaAnual() * 0.25 - calcularDescontoGastoSaude();
       /*
        if (getRendaAnual() < 20000){
            return getRendaAnual() * 0.15 - calcularDescontoGastoSaude();
        }else {
            return getRendaAnual() * 0.25 - calcularDescontoGastoSaude();
        }*/
    }

    public Double calcularDescontoGastoSaude(){
        return (gastoSaude > 0 ) ? gastoSaude * 0.50 : 0.0 ;
        /*if (gastoSaude != 0){
           return gastoSaude * 0.50;
        }else {
           return 0.0;
        }*/
    }
}
