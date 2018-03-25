import java.util.*;
public class Ejercicio11Condicionales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float nota;
				
		System.out.println("Ingrese una Nota: \n");
		nota = entrada.nextFloat();
		
		while (nota<1 || nota>10) {
			System.out.println("Ingrese una Nota (1-10): \n");
			nota = entrada.nextFloat();
		}
		System.out.println("----------Notas---------");
		if (nota < 5) {
			System.out.println("Tu nota es: " + nota + " Insuficiente");
		}else if (nota < 6) {
			System.out.println("Tu nota es: " + nota + " Suficiente");
		}else if (nota < 7) {
			System.out.println("Tu nota es: " + nota + " Bien");
		}else if (nota < 9) {
			System.out.println("Tu nota es: " + nota + " Notable");
		}else {
			System.out.println("Tu nota es: " + nota + " Sobresaliente");
		}

	}

}
