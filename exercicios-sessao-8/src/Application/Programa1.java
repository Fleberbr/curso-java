package Application;

import java.util.Locale;
import java.util.Scanner;

import Entitites.Retangulo;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		
		System.out.println("Entre com a largura e a altura do retângulo:");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.println(ret);
		
		
	}

}
