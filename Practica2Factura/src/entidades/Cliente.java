package entidades;

public class Cliente extends Entidad{
	
	private String nif;
	
	public Cliente(int id, String nombre, Direccion direccion, String telefono, String email , String nif) {
		super(id, nombre, direccion, telefono, email);
		this.nif = nif;
	}

		public String getNombre () {
			return nombre;
		}
	

}
