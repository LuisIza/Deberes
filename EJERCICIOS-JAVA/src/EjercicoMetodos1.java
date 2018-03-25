import java.util.Scanner;
public class EjercicoMetodos1 {

	public static void main(String[] args) {

		String nombre = leerNombre();
		String edad = leerEdad();
		System.out.println("Hola, "+nombre+ " no parece que tengas " + edad +" años");
	}
	
	static String leerNombre() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nEscribe tu nombre: ");
		String nombre = entrada.nextLine();
		return nombre;
	}
	static String leerEdad() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nEscribe tu edad: ");
		String edad = entrada.nextLine();
		return edad;
	}
	

}
