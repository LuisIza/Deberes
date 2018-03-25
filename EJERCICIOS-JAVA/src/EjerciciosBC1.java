/*
 * Escribe un programa que invente un nº aleatorio entre 1 y 10. 
 * El usuario tendrá que adivinarlo en tres intentos como máximo. 
 * Al finalizar el programa se le dirá si ha acertado 
 * el número y en cuántos intentos lo ha hecho. 
 * Utiliza while  y break
 */

/*
 * @Autor Luis
 */

import java.util.*;
public class EjerciciosBC1 {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int aleatorio = (int) (Math.random() * 10 + 1);
		//System.out.println(aleatorio);
		int num=0;
		System.out.println("---Juego Adivina el Número (1-10)---");
		int i = 1;
	
		while (i <= 3){
			System.out.println("Número? ");
			num = entrada.nextInt();
			
			if(num == aleatorio){
				break;
			}
			i++;
			
		} 
		
		if(num == aleatorio){
			System.out.println("Has acertado XD con " + i + " intento/s");
		}else{
			System.out.println("Has fallado :C");
}

	}

}
