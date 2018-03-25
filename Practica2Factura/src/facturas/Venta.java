package facturas;
public class Venta {

	private Articulo articulo; // Artículo vendido
	private int uds; // Unidades vendidas del artículo

	public Venta(Articulo articulo, int uds) {
		this.articulo = articulo;
		this.uds = uds;
	}

	public String nombre() {
		return articulo.getNombre();
	}

	public double pud() {
		return articulo.getPud();
	}

	public int uds() {
		return uds;
	}

}