/*
 * @Autor Luis Iza
 */

import java.util.*;
public class Practica21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double salarios [] = new double[10];
		final int sMax = 1500;
		int posMin=0;
		int posMax=0;
		double sMedio=0;
		int contador=0;
		
		System.out.println("Registro de Salarios");
		
		for(int i = 0; i<salarios.length; i++) {
			System.out.println("Salario " + (i+1));
			salarios[i]= entrada.nextDouble();
			
			for(int j=0; j<salarios.length; j++) {
				if(salarios[j]< salarios[posMin]) {
					posMin=j;
				}
				
				if(salarios[j]> salarios[posMin]) {
					posMax=j;
				}
			}
			
			if(salarios[i] > sMax) {
				contador++;
			}
			
			sMedio = sMedio+salarios[i];
				
		}
		sMedio = sMedio/salarios.length;
		
		System.out.println("=========================================");
		System.out.println("             Tabla Salarial");
		System.out.println("-----------------------------------------");
		System.out.println("Salario Máximo: " + salarios[posMax]+" €");
		System.out.println("Salario Mínimo: " + salarios[posMin]+" €");
		System.out.println("Salario Medio: " + sMedio +" €\n");
		System.out.println(contador + " Empleados con sueldo superior a " + sMax + " €");

	}

}
