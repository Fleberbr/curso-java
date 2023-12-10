import java.util.Locale;
import java.util.Scanner;

public class for_Estrutura_repeticao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= n; i++ ) {
			int x = sc.nextInt();
			
			if ( x >= 10 && x <= 20) 
				in ++;
			else		
				out ++;
		}
		System.out.printf("%s in %n",in) ;
		System.out.printf("%s out %n",out) ;
		
		sc.close();	
	}
}
