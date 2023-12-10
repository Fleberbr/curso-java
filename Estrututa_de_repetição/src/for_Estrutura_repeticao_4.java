
import java.util.Locale;
import java.util.Scanner;

public class for_Estrutura_repeticao_4 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		

		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double resultado = 0 ;
			
			if (x1 == 0)
				System.out.println("0.0");
			else if (x2 == 0)
				System.out.println("divisao impossivel");
			else {
				resultado = x1/x2;
				System.out.printf("%.1f%n", resultado);
			}
		}
		sc.close();
	}

}
