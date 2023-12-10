import java.util.Scanner;

public class while_Estrutura_repeticao_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (x != 4) {
			switch (x) {
			case 1: 
				alcool ++;
				break;
			
			case 2: 
				gasolina ++;
				break;
			
			case 3: 
				diesel ++;
				break;
			}	
			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %s%n",alcool);
		System.out.printf("Gasolina: %s%n",gasolina);
		System.out.printf("Diesel: %s%n",diesel);

		sc.close();	

	}

}
