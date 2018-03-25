package factura;

public class App {

	public static void main(String[] args) {
		
		Articulo a1 = new Articulo ("HP Envy 15",750);
		Articulo a2 = new Articulo ("Cable USB 3m",8);
		Articulo a3 = new Articulo ("Teléfono móvil Xiaomi",215);
		Articulo a4 = new Articulo ("Asus Teclado",125);
		Articulo a5 = new Articulo ("BQ Monitor",225);
		Articulo a6 = new Articulo ("Epson Impresora",199);
		
		Venta v1= new Venta (new Articulo ("HP Envy 15",750),1);
		Venta v2= new Venta (a2,2);
		Venta v3= new Venta (a3,1);
		Venta v4= new Venta (a4,1);
		Venta v5= new Venta (a5,1);
		Venta v6= new Venta (a6,1);
					
				
		Factura factura = new Factura();
		factura.setEmpresa("PROGRAMACIÓN S.A.\nC/ Cóndor, 9\n07181 Son Ferrer (Calvià)\nTel: 971 230 470");
		factura.setFecha("24 de febrero de 2018");
		factura.setComprador("Luis Iza");
				
		factura.addVenta(v1);
		factura.addVenta(v2);
		//factura.addVenta(v3);
		//factura.addVenta(v3);
		//factura.addVenta(v3);
		//factura.addVenta(v4);
		//factura.addVenta(v5);
				
		factura.imprimir();

	}

}
