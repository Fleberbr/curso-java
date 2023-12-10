package testes_matemáticos;

public class funcoes_matemáticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x);// sqrt é raiz quadrada.
		B = Math.sqrt(y);// sqrt é raiz quadrada.
		C = Math.sqrt(25.0);// sqrt é raiz quadrada.

		System.out.println("Raiz quadrada de " + x +" = " + A);
		System.out.println("Raiz quadrada de " + y +" = " + B);
		System.out.println("Raiz quadrada de 25" + C);
		
		A = Math.pow(x , y);// pow é elevado.
		B = Math.pow(x , 2.0);// pow é elevado.
		C = Math.pow(5.0, 2.0);// pow é elevado.

		System.out.println(x + " elevado a " + y +" = " + A);
		System.out.println(x + " elevado a " + 2.0 + " = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);// abs é o valor absoluto, ignora números negativos e deixa positivo
		B = Math.abs(z);// 
		System.out.println("valor absoluto de " + y + " = " + A);
		System.out.println("valor absoluto de " + z + " = " + B);
		

		
	}

}
