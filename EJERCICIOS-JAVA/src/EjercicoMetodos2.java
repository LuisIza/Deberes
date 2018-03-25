import java.util.Scanner;
public class EjercicoMetodos2 {

	public static void main(String[] args) {

		String nombre = leerNombre();
		String edad = leerEdad();
		System.out.println("Hola, "+nombre+ " no parece que tengas " + edad +" años");
	}
	
	static String leerNombre() {
		String nombre = "LUIS";
		return nombre;
	}
	static String leerEdad() {
		String edad = "30";
		return edad;
	}
	

}
