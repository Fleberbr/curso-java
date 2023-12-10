import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = 3.14159 * (Math.pow(sc.nextDouble(), 2));

		System.out.printf("A= %.4f%n", raio);

		sc.close();
	}
}
