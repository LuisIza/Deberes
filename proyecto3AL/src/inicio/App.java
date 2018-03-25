package inicio;
import biblioteca.Autor;
import biblioteca.Libro;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
	
		System.out.println("Ingrese los datos del autor");
		System.out.println("Nombre: ");
		String nombre = scan.nextLine();
		System.out.println("Email: ");
		String email = scan.nextLine();
		System.out.println("Año de nacimiento: ");
		int  anyo = scan.nextInt();
		scan.nextLine();
		System.out.println("Titulo: ");
		String titulo = scan.nextLine();
		System.out.println("ISBN: ");
		String isbn = scan.nextLine();
		System.out.println("Año del libro: ");
		int  anyolibro = scan.nextInt();
		
		Autor autor = new Autor(nombre,email,anyo);
		Libro libro = new Libro(titulo,isbn,autor);
		
		libro.setAnyo(anyolibro);
		
		System.out.println(autor.toString());
		System.out.println(libro.toString());

	}

}
