/*
 * @Autor Luis
 * Crea un programa que pregunte el nombre del usuario y luego lo escriba. 
 * Ahora bien, si el usuario no introduce nada, 
 * el nombre deberá quedar con el valor "Desconocido"
 */
import java.util.*;
public class Ejercicio21 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre = " ";
		
		System.out.println("Ingrese su Nombre: ");
		nombre = entrada.nextLine();
		
		if (nombre.isEmpty() || nombre.equals(" ")) {
		
			System.out.println("Valor Desconocido");
		}else {
			System.out.println("Tu nombre es: "+ nombre );
		}
	}

}
