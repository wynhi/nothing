package pe.edu.upeu.examen;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		double b = 0;
		System.out.println("Ingrese un monto: ");
		double m = scan.nextDouble();
		
		if (m<=1000) {
			System.out.println("no recive bonificacion");
		} else if ( m>= 1000 && m<= 5000) {
			b = m*3/100;
			System.out.println("su bonificacion es: "+m);
		} else if ( m>=500  && m <= 20000) {
			b = m*5/100;
			System.out.println("su bonificacion es: "+m);
		} else if ( m>20000 ) {
			b = m*8/100;
			System.out.println("su bonificacion es: "+m);
		}

		

	}

}
