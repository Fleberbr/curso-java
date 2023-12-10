import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.println(x);
		System.out.printf("%.2f%n", x); // printf é para imprimir formatado, o %n é para quebrar linha
		System.out.printf("%.4f%n", x); // printf é para imprimir formatado, o %n é para quebrar linha
		System.out.println("Mudar o padrão da virgula");
		Locale.setDefault(Locale.US); // para mudar o padrão de . para ,
		System.out.printf("%.4f%n", x); // printf é para imprimir formatado, o %n é para quebrar linha

		System.out.println("imprimir texto mais números");

		System.out.println("Resultado = " + x + " metros");

		System.out.println("Outra forma de colocar os valores...");
		System.out.printf("Resultado = %.2f metros\n", x);

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais \n", nome, idade, renda);

	}

}
