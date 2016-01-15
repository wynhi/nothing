package pe.edu.upeu.examen;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		
		
        Scanner scan = new Scanner(System.in);
		
		int b = 0;
		System.out.println("Ingrese un numero: ");
		int x = scan.nextInt();
		
		if (x==1) {
			System.out.println("A");
		} else if (x==2) {
			System.out.println("E");
		} else if (x==3) {
			System.out.println("I");
		} else if (x==4) {
			System.out.println("O");
		} else if (x==5) {
			System.out.println("U");
		} else if (x>=6) {
			System.out.println("Ud. ha ingresado un valor incorrecto");
		}
		

	}

}
