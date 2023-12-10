
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class for_Estrutura_repeticao_7 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		
		for (int i = 1; i <= n; i++) {
			
			int	quadrado = i * i;
			int cubo = i * i * i; 
			
			System.out.printf("%s %s %s\n",i,quadrado,cubo);  
			    
				
		}
		
		sc.close();
	}

}
