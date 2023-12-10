import java.util.Locale;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int Num_func = sc.nextInt();
		int horas_trabalhadas = sc.nextInt();
		double valor_hora = sc.nextDouble();
		double salario = valor_hora * horas_trabalhadas;
		
		System.out.println("NUMBER = " + Num_func);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
		
	}

}
