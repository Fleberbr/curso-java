
import java.util.Locale;

public class Exercicio_S4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String product1 = "Computer";
		String product2 = "Officer desk";

		int age = 30;
		int code= 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf(product1 + ", which price is $ %.2f\n", price1); //One way
		System.out.printf("%s, which price is $ %.2f\n",product2, price2); //another way
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s %n",age,code,gender );
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f %n",measure);
		System.out.printf("Rouded (three decimal places: %.3f %n",measure);
		Locale.setDefault(Locale.US); //change , to .
		System.out.printf("US decimal point: %.3f %n",measure);

	}

}