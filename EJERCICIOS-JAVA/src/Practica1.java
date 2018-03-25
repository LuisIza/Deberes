/*
 * @Autor Luis
 */

//JUEGO DE PIEDRA, PAPEL O TIJERAS

import java.util.*;
public class Practica1 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	String opciones []= {"x","Piedra", "Papel", "Tijera"};
	int opcion=0;
	int auto=0;
	
		auto= (int) (Math.random() * 3 + 1);
		System.out.println("\tPiedra, Papel, o Tijera");
		System.out.println("\t========================");
		System.out.println("\tElige:");
		
		for (int i=1; i<opciones.length; i++) {
			System.out.println("\t\t"+i+") "+ opciones[i]);
		}
		opcion=entrada.nextInt();
					
		if (opcion <1 || opcion >3) {
			System.out.println("La opción ingresada no existe vuelva a intentarlo");
		}else {
			System.out.println("\tLa máquina saca... "+ opciones[auto]);
			
			switch(auto) {
			case 1:
				if (opcion == auto) {
					System.out.println("\t¡Ha habido empate!");
				}else if (opcion == 3) {
					System.out.println("\tHas perdido :(");
				}else {
					System.out.println("\t¡Ha ganado el Jugador!");
				}
				break;
			case 2:
				if (opcion == auto) {
					System.out.println("\t¡Ha habido empate!");
				}else if (opcion == 1) {
					System.out.println("\tHas perdido :(");
				}else {
					System.out.println("\t¡Ha ganado el Jugador!");
				}
				break;
			case 3:
				if (opcion == auto) {
					System.out.println("\t¡Ha habido empate!");
				}else if (opcion == 2) {
					System.out.println("\tHas perdido :(");
				}else {
					System.out.println("\t¡Ha ganado el Jugador!");
				}
				break;
			}
		}
}
}