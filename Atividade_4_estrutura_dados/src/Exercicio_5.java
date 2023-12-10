import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int cod_pc_1 = sc.nextInt();
		int num_pc_1 = sc.nextInt();
		double valor_pc_1 = sc.nextDouble();
	
		
		int cod_pc_2 = sc.nextInt();
		int num_pc_2 = sc.nextInt();
		double valor_pc_2 = sc.nextDouble();	
		
		double total = num_pc_1 * valor_pc_1 + num_pc_2 * valor_pc_2 ;
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		
		
	}	
}
