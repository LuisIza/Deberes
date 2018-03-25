/*
 * Crea una aplicación para probar la capacidad de cálculo mental de los usuarios. 
 * Se calcularán dos números aleatorios entre 1 y 100 y se mostrarán en pantalla. 
 * A continuación el usuario deberá escribir 
 * el resultado de la suma de ambos números y se le indicará si ha acertado o no.
 * Estas acciones se repetirán indefinidamente mediante un bucle while.
 */

/*
 * @Autor Luis
 */

import java.util.*;
public class EjerciciosBC4 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("------Cálculo Mental------");
		int num1 = 0;
		int num2 = 0;
		int resultado= 0;
		char letra;
		String teclado;
		
		while (true){
			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);
			
		System.out.println("Suma los siguientes números");
		System.out.println("\t"+num1 + " + "+ num2 );
					
			System.out.println("Total? ");
			resultado = entrada.nextInt();
			
			if(resultado == (num1+num2)){
				System.out.println("Has acertado XD \n");
			}else {
				System.out.println("Has fallado el resultado era " + (num1+num2)+"\n");
			}
			System.out.println("¿Quieres continuar (s/n)?");
			teclado = entrada.nextLine();
			letra = (teclado.charAt(0));
			
			//System.out.println("===========================================\n" + letra);
				
		} 
	


	}

}
