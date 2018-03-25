/*
 * @Autor Luis
 */

public class Ejercicios403 {

	public static void main(String[] args) {
		
		double cotizaciones []= {47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7};
		int posMin=0;
		int posMax=0;
		double temp=0;
		
		System.out.println("       Valores de las acciones de Microsoft tabla original");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < cotizaciones.length; i++) {
			System.out.print(cotizaciones[i] + " | ");
		}
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("       Valores de las acciones de Microsoft tabla ORDENADA");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < cotizaciones.length-1; i++) {
			posMin=i;
			for (int j = i+1; j < cotizaciones.length; j++) {
				if (cotizaciones[j]< cotizaciones[posMin]) {
					posMin=j;
				}
			}
			temp= cotizaciones[i];
			cotizaciones[i]=cotizaciones[posMin];
			cotizaciones[posMin]=temp;
		}
		for (int i = 0; i < cotizaciones.length; i++) {
			System.out.print(cotizaciones[i] + " | ");
		}
	
	}

}
