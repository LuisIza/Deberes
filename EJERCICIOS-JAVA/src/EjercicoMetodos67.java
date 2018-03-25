import java.util.Scanner;
public class EjercicoMetodos67 {

	public static void main(String[] args) {

		double numero = 8.5;
		System.out.println("El número elevado al cuadrado es: " +cuadrado(numero)); 
		
		System.out.println("El número elevado al cubo es: " +cubo(numero)); 

	}	
	
	static double cuadrado (double base) {
		double total = base * base;
		return total;
	}
	
	static double cubo (double base) {
		double total = base * base * base;
		return total;
	}

}
		
