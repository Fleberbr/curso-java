import java.util.Scanner;

public class for_Estrutura_repeticao_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		for (int i = 1; i <= x; i++ ) {
			if ( i % 2 == 1) { 
				 System.out.println(i) ;
			}			
		}
		sc.close();	

	}

}
