package entities;


public class Conta {

	public static final double tarifaSaque = 5.00 ;
			
	private Integer numeroConta;
	private String nomeCliente;
	private double saldoEmConta;	
	
	public Conta (Integer conta, String nomeCliente, double depositoInicial) {
	this.numeroConta = conta;
	this.nomeCliente = nomeCliente;
	realizarDeposito(depositoInicial);
	}
	
	public Conta (Integer conta, String nomeCliente) {
		this.numeroConta = conta;
		this.nomeCliente = nomeCliente;
	}
	
	public Conta (String nomeCliente) {
	this.nomeCliente = nomeCliente;
	}

	public Integer getnumeroConta() {
		return numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Double getSaldoEmConta() {
		return saldoEmConta;
	}


	public void realizarSaque (Double valorSaque) {
		saldoEmConta -= valorSaque + tarifaSaque;
	}
	
	public void realizarDeposito (Double valorDeposito) {
		saldoEmConta += valorDeposito;
	}
		
	public void imprimirSaldo() {
		System.out.printf("Conta %s, Dono: %s, Balanço: R$ %.2f%n%n",numeroConta,nomeCliente,saldoEmConta);
	}
	
	public String toString() {
		return "Conta"
				+ numeroConta 
				+ ", Dono: "
				+ nomeCliente
				+ ",Balanço: R$ "
				+ String.format("%.2f",saldoEmConta);
	}
}
