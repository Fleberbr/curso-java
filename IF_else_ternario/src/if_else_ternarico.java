import java.util.Scanner;

public class if_else_ternarico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		String resultado = (x > -1) ? "POSITIVO" : "NEGATIVO";

		System.out.printf("O número é %s %n", resultado);

		switch (x) {
		case (1):
			System.out.println("O número é 1");
			break;
		default:
			System.out.println("O número não é 1");
			break;
		}

		sc.close();

	}

}
