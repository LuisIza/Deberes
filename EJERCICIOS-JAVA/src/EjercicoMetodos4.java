import java.util.Scanner;
public class EjercicoMetodos4 {

	public static void main(String[] args) {

		int numeros []= {2,59,7,8,10,15,3,20};
		
		imprimirArray(numeros);
		ordenar(numeros);
		
		System.out.println("\n");
		imprimirArray(numeros);
	}
	
	static void ordenar(int numeros[]) {
		int posMin=0;
		int posMax=0;
		int temp=0;
		
		for (int i=0; i < numeros.length-1; i++) {
			posMin=i;
			for (int j = i+1; j < numeros.length; j++) {
				if (numeros[j]< numeros[posMin]) {
					posMin=j;
				}
			}
			temp = numeros[i];
			numeros[i]= numeros[posMin];
			numeros[posMin]= temp;	
			
		}
	}
		
	static void imprimirArray (int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}
	}
}
		
