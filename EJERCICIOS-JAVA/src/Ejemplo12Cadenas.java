import java.util.Scanner;

public class Ejemplo12Cadenas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Ejemplo length()
		System.out.print("Escribe una frase: ");
		String frase = entrada.nextLine();

		System.out.println("Tu frase tiene " + frase.length() 
				+ " caracteres.");
		
		// Ejemplo charAt()
		System.out.println("Esto es tu frase en vertical:");
		for (int i = 0; i < frase.length(); i++) {
			
			System.out.println(frase.charAt(i));
			
		}
		
		//Ejemplo replace()
		
			System.out.println("Frase cambiadas las o x i");	
			frase.replace('o', 'i');
				
			System.out.println(frase.replace('o', 'i'));
			
		//Ejemplo indexOf()
			
			System.out.println("Ingrese un email");
			String mail=entrada.nextLine();
			if (mail.indexOf('@')<1) {
				System.out.println("Email incorrecto");
			}else {
				System.out.println("Email correcto");
			}
			
					

	}

}
