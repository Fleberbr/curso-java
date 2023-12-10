import java.util.Scanner;

public class while_Estrutura_repeticao_1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		while (valor != 2002) {
			System.out.println("Senha inválida");
			valor = sc.nextInt();
			
		}
		System.out.print("Acesso permitido");
		
		
	}

}
