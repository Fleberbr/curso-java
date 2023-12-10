import java.util.Scanner;

public class Teste_scanner_daddos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		
		
		x = sc.nextInt(); 
		sc.next(); //usado para não dar bug na apresentação dos dados(consome o dado que fica na entrada padrão
		s1= sc.nextLine();  //apenas o next, lê apenas a primeira palavra digitada.
		s2= sc.nextLine();
		s3= sc.nextLine();
		
		System.out.println("valor digitado :");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);			
		
		//para ler número sc.nextInt
		
		sc.close();
				
				
	}

}
