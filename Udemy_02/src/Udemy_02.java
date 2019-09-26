import java.util.Locale;

public class Udemy_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String produto01 = "Computador";
		String produto02 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char agender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double point = 53.23456;
		double point1 = 53.235;
		
		System.out.println("Produtos");
		System.out.printf("%s,which price is $ %.1f%n ",produto01,price1);
		System.out.printf("%s,which price is $ %.2f%n",produto02,price2);
		System.out.printf("Record : %d years old, code %d and ager: %s%n",age,code,agender);
		System.out.printf("Point, with eigth decimal places: %.5f%n",point);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point : % .3f%n", point1 );
		

		

	}

}
