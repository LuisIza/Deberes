import java.util.Scanner;
public class EjercicoMetodos3 {

	public static void main(String[] args) {

		String nombre = leerNombre();

		System.out.println("Hola, "+nombre);
	}
	
	static String leerNombre() {
		Scanner entrada = new Scanner(System.in);
		System.out.print("\nEscribe tu nombre: ");
		String nombre = entrada.nextLine();
		return nombre;
	}

}
