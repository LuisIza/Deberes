package entidades;

public abstract class  Entidad {
	protected int id;
	protected String nombre;
	protected Direccion direccion;
	protected String telefono;
	protected String email;
	
	public Entidad(int id, String nombre, Direccion direccion, String telefono, String email) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	
}
