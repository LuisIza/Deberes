package factura;

public class Factura {
	private final int MAX_LINEAS = 5;
	private final int IVA = 21;
	private String empresa;
	private String fecha;
	private String comprador;
	private Venta []ventas;
	private int linea ;
	
	public Factura() {
		ventas = new Venta [MAX_LINEAS];
		linea = 0;
	}
	public void addVenta(Venta venta) {
		
		if (linea == MAX_LINEAS ) {
			System.out.println(">> ERROR: TAMAÑO DE FACTURA EXCEDIDO.\n"
					+">> EL ÚLTIMO ARTÍCULO NO SE HA AÑADICO A LA FACTURA.");
			
		}
		
		if (linea <MAX_LINEAS) {
			ventas[linea] = venta;
		}
		linea ++;
	}
	
	private boolean facturaVacia() {
		if (empresa == null || fecha == null || comprador == null) {
			return false;
		}
		if (linea <MAX_LINEAS) {
			if (ventas[linea] == null && linea == 0) {
				return false;
		}
		}
		
		return true;
	}
	
	public void imprimir () {
		double subtotal=0;
				
		if (facturaVacia()) {
			System.out.println(empresa);
			System.out.println("\nCliente: " + comprador);
			System.out.println("Fecha de compra: " + fecha+ "\n\n");
			
			System.out.printf("%-25s %5s  %15s  %15s \n", "Artículo", "Uds","P/Ud","Total");
			System.out.printf("%-25s %5s  %15s  %15s \n","=========================","====","==============","=============");
			
			for (int i = 0; i <ventas.length; i++) {
				if (ventas[i]!=null) {
					subtotal= subtotal + (ventas[i].getUds()*ventas[i].pud());
					System.out.printf("%-25s %5d  %13.2f %1s  %13.2f %1s \n",
							ventas[i].nombre() , ventas[i].getUds(), ventas[i].pud(),"€",(ventas[i].getUds()*ventas[i].pud()),"€");
				}
			}
			System.out.println("");
			System.out.printf("%48s %13.2f  %1s\n","Total:", subtotal ,"€");
			System.out.printf("%48s %13.2f  %1s\n","IVA (21%):", subtotal*IVA/100 ,"€");
			System.out.printf("%48s %13.2f  %1s\n","A pagar:", subtotal +(subtotal*IVA/100) ,"€");
			System.out.println("\nGRACIAS POR SU COMPRA.");
			
			
		}else {
			System.out.println("=============================\n"
					+ ">> ERROR: FACTURA INCOMPLETA."
					+ "\n=============================");
		}
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	
}
