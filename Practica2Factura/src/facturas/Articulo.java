package facturas;

public class Articulo {

	private String nombre;
	private double pud; // Precio por unidad

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