package biblioteca;
import biblioteca.Autor;

public class Libro {
	private String titulo;
	private String isbn;
	private Autor autor = new Autor();
	private static int anyoActual;
	
	// CONSTRUCTORES
	public Libro () {
		
	}
	public Libro (String titulo) {
		this.titulo = titulo;
	}
	public Libro (String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}
	// METODOS
	
		public String toString () {
			return "Datos del Libro"
					+ "\n-------------------------\n"+
					"Titulo: "+titulo+
					"\nISBN: "+ isbn+
					"\nAño del libro "+ anyoActual;
		}
		
		public String getTitulo() {
			return titulo;
		}
		public String getIsbn() {
			return isbn;
		}
		public int getAnyo() {
			return anyoActual;
		}
		
		public  void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public  void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public  void setAnyo(int anyo) {
			this.anyoActual = anyo;
		}
	
}
