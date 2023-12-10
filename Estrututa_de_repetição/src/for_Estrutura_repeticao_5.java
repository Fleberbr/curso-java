
import java.util.Locale;
import java.util.Scanner;

public class for_Estrutura_repeticao_5 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int resultado = 1 ;

		for (int i = 1; i <= n; i++) {
			resultado = resultado * i;
		}
		System.out.println(resultado);
		sc.close();
	}

}
