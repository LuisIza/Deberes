/*
 * @Autor Luis
 */

public class Ejercicios404 {

	public static void main(String[] args) {
		
		double temperaturas []= {3.2, 3.5, 7.2, 0.1, 1, -2.3, -5, 3.4, 4, 4, 4, 1.4, 2.5, -0.4, -3.6};
		int posMin=0;		
		System.out.println("      \t \t\tTabla de Registro de Temperatutas");
		System.out.println("---------------------------------------------------------------------------------------------");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print(temperaturas[i] + " | ");
		}
		System.out.println("\n---------------------------------------------------------------------------------------------");
		
		for (int i = 0; i < temperaturas.length-1; i++) {
			if (temperaturas[i]< 0) {
					posMin=i;
				System.out.println("Primera temperatura menor que cero esta en la posición: "+posMin);
				break;
			}
		}
	}

}
