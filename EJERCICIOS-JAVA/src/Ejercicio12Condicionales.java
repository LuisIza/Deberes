import java.util.*;
public class Ejercicio12Condicionales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese el número del mes?");
		int mes = entrada.nextInt();
		switch (mes) {
			case 1:
				System.out.println("Enero");
			break;
			case 2:
				System.out.println("Febrero");
			break;
			case 3:
				System.out.println("Marzo");
			break;
			case 4:
				System.out.println("Abril");
			break;
			default:
				System.out.println("Número Fuera de Rango...");
				
			
		}

	}

}
