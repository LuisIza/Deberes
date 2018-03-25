package facturas;

import entidades.Cliente;
import entidades.Empresa;

public class Factura  {

	private final int MAX_LINEAS = 3; // Máximo de líneas (ventas) en una factura
	private final int IVA = 21;

	private Empresa empresa;
	private String fecha;
	private Cliente comprador;
	private Venta[] ventas;
	private int linea; // Posición del array ventas que rellenaremos

	public Factura() {

		ventas = new Venta[MAX_LINEAS];
		linea = 0;

	}

	public void addVenta(Venta venta) {

		if (linea < MAX_LINEAS) {
			ventas[linea] = venta;
			linea++;
		} else {
			System.out.println(">> ERROR: TAMAÑO DE FACTURA EXCEDIDO.");
			System.out.println(">> EL ÚLTIMO ARTÍCULO NO SE HA AÑADIDO A LA FACTURA.");
		}

	}

	public void imprimir() {

		double total = 0;
		double parcial = 0;

		if (facturaVacia()) {
			System.out.println(">> ERROR: FACTURA INCOMPLETA.");
			return;
		}

		System.out.println(empresa.toString());
		System.out.println("\nCliente: " + comprador.getNombre());
		System.out.println("Fecha de compra: " + fecha + "\n\n");

		System.out.printf("%-25s %4s %12s %12s\n", "Artículo", "Uds", "P/Ud", "Total");
		System.out.printf("%-25s %4s %12s %12s\n", "========================", "====", "===========", "===========");

		for (int i = 0; i < linea; i++) {

			parcial = ventas[i].uds() * ventas[i].pud();
			System.out.printf("%-25s %4d %10.2f € %10.2f €\n", ventas[i].nombre(), ventas[i].uds(), ventas[i].pud(),
					parcial);

			total += parcial;

		}

		System.out.printf("\n%43s %10.2f €", "Total:", total);
		System.out.printf("\n%43s %10.2f €", "IVA (" + IVA + "%):", total * 0.21);
		System.out.printf("\n%43s %10.2f €", "A pagar:", total + total * IVA / 100);

		System.out.println("\n\nGRACIAS POR SU COMPRA.");

	}

	private boolean facturaVacia() {

		if (empresa == null || fecha == null || comprador == null || ventas[0] == null) {
			return true;
		}

		return false;

	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setComprador(Cliente cliente) {
		this.comprador = cliente;
		
	}

}