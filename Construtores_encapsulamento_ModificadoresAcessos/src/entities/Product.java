package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	
	/*Assim se escreve um construtor (A quantidade de parâmetros é oque você quiser iniciar na classe.
	dessa forma obrigamos a toda vez que a classe for instanciada, que os valores sejam enviados ao ser instanciada.
	Para this. sempre se refere a variável da classe.*/
	public Product (String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Usando o conceito de sobrecarga (usar o mesmo nome do método com parâmetros diferentes para realizar um atividade diferente
	public Product (String name, double price){
		this.name = name;
		this.price = price;
		quantity = 0;
	}
	
	public Product () {}
	
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
