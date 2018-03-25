package entidades;

public class Empresa extends Entidad{
	
	private String cif;
	
	public Empresa(int id, String nombre, Direccion direccion, String telefono, String email, String cif) {
		super(id, nombre, direccion, telefono, email);
		this.cif= cif;
	}
	
	public String toString() {
		return nombre + "\n" +  
				direccion.getCalle() + ", " + direccion.getNum() + "\n"+
				direccion.getCp() + " " + direccion.getPoblacion() + "(" + direccion.getProvincia()+ ")\n"+
				"Tel: " + telefono ;
	}

}
