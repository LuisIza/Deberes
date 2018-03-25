/*
 * @Autor Luis
 * 
 * Crea un programa que calcule la hora de cierre de una tienda. 
 * Esta hora depende del valor de una variable de tipo String llamada dia. 
 * Si su valor es "entre semana", la hora de cierre de la tienda será "20:00". 
 * En otro caso, la hora de cierre será "14:00"
 */
public class Ejercicio22 {

	public static void main(String[] args) {
		String dia = "entre semana";
		
		if (dia == "entre semana") {
			System.out.println("La hora de cierre de la tienda es 20:00 hrs");
		}else {
			System.out.println("La hora de cierre de la tienda es 14:00 hrs");
		}
	}

}
