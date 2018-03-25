package factura;

public class Venta {
	private Articulo articulo ;
	private int uds;
	
	public Venta(Articulo articulo, int uds) {
		this.articulo = articulo;
		this.uds = uds;
	}
	
	public String nombre () {
		return articulo.getNombre();
	}
	
	public double pud () {
		return articulo.getPud();
	}

	public int getUds() {
		return uds;
	}

	
	
	
}
