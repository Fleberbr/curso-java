package Entitites;

public class Estudante {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	

	public double calculoNotaFinal() {
		return (nota1 + nota2 + nota3);
	}
	
	public void consultarAprovacao(){
		if ( calculoNotaFinal() > 60.0)
			System.out.println("Aprovado");
		else
			System.out.printf("Reprovado\n Faltou %.2f pontos ",(60- calculoNotaFinal()));
	}
}	

