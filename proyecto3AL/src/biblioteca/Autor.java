package biblioteca;

public class Autor {
	private String nombre;
	private String email="Unknow";
	private int fechaNacimiento=0;
	
	// 	CONSTRUCTORES
	public Autor() {
		
	}
	public Autor (String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}
	public Autor (String nombre) {
		this(nombre,"Unknow",0);
	}
	
	// METODOS
	
	public String toString () {
		return "Datos Autor del Libro"
				+ "\n-------------------------\n"+
				"Nombre del autor: "+nombre+
				"\nEmail: "+ email+
				"\nFecha de Nacimiento: "+ fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public int getFecha() {
		return fechaNacimiento;
	}
	
	public  void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	public  void setFecha(int fecha) {
		this.fechaNacimiento = fecha;
	}
	
}
