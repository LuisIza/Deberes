/*
 * @Autor Luis
 */

public class Ejercicios402 {

	public static void main(String[] args) {
		
		double cotizaciones []= {47.5, 47.8, 48, 48.1, 47.7, 47.3, 46, 47.9, 48.05, 48.7};
		int posMin=0;
		int posMax=0;
		System.out.println("                  Valores de las acciones de Microsoft");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < cotizaciones.length; i++) {
			System.out.print(cotizaciones[i] + " | ");
			if (cotizaciones[i]< cotizaciones[posMin]) {
				posMin=i;
			}
			if (cotizaciones[i]> cotizaciones[posMax]) {
				posMax=i;
			}
		}
		System.out.println("\n----------------------------------------------------------------------");
		System.out.println("Cotización máxima: " + cotizaciones[posMax]);
		System.out.println("Cotización mínima: " + cotizaciones[posMin]);
	
	}

}
