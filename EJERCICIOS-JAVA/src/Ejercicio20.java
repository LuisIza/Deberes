/*
 * @Autor Luis
 * 
 * Escribe un programa que pida la edad del usuario. 
 * Si ésta es menor de 18 años, 
 * el valor de la variable mayorDeEdad será verdadero. 
 * Si no, será falso. Al final se mostrará este valor.
 */
import java.util.*;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final boolean mayorDeEdad;
		int edad;
		
		System.out.println("Ingrese su edad? ");
		edad= entrada.nextInt();
		
		if(edad<18) {
			mayorDeEdad=true;
			System.out.println(mayorDeEdad);
		}else {
				mayorDeEdad=false;
				System.out.println(mayorDeEdad);
			}
		}
	}


