package factura;

public class Articulo {
	private String nombre;
	private double pud;
	
	public Articulo(String nombre, double pud) {
		this.nombre = nombre;
		this.pud = pud;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPud() {
		return pud;
	}

	
}
