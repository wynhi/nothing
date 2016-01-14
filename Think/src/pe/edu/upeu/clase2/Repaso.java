package pe.edu.upeu.clase2;

public class Repaso {

	public static void main(String[] args) {
		
	Repaso r = new Repaso();	
		
		
		
		double a = 25;
		double b = 144;
		
		
		
	
		
		// suma+.
		// resta-.
		// multiplicacion*.
		// dividion/.
		// modulo %
		// lase math 
		
		
		//esta intrustruicion me sirve para imprimir 
		System.out.println(Math.sqrt(a+b));
		
		System.out.println("operaciones logicas");
		
		System.out.println(!true);
		
		System.out.println("calculando el IGV");
		System.out.println("IGV: "+r.calcIGV(100));
		
		System.out.println("calculando el IMC");
		System.out.println("el IMC es: "+r.calcIMC(75,1.75 ));
		
	}
	 
	public int sumar(int sum1,int sum2){
	
		return sum1 + sum2;
		

	}
	
	public double calcIGV(double monto){
		double igv = 18;
		
		return monto * igv/100;
	}
		
	double peso = 70;
	double altura = 1.75;
	
	public double calcIMC(double peso,double altura ){
		double r = peso/(altura*altura);
		return r;
		
	}
	
	

}
