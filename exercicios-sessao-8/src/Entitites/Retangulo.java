package Entitites;

public class Retangulo {

	public double altura;
	public double largura;
	
	
	public double calculoArea() {
		return altura * largura;
	}
	
	public double calculoPerimetro() {
		return (altura + largura) *2;
	}
	
	public double calculoDiagonal() {
		return Math.sqrt(altura *altura + largura * largura);
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f",calculoArea())
				+ "\nPERIMETRO = "
				+ String.format("%.2f",calculoPerimetro()) 
				+ "\nDIAGONAL = " 
				+ String.format("%.2f",calculoDiagonal());
						
	}
}
