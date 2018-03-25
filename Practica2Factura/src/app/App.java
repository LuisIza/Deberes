package app;

import entidades.Cliente;
import entidades.Direccion;
import entidades.Empresa;
import facturas.Articulo;
import facturas.Factura;
import facturas.Venta;

public class App {

	public static void main(String[] args) {

		
		Empresa empresa = new Empresa (001,"PROGRAMACIÓN S.A.",new Direccion ("C/ Cóndor", "9","07181","Son Ferrer","Calvià", "España")
				,"971 230 470","prog@prog.com","B-56894127");
		
		Cliente cliente = new Cliente(015,"Luis Iza",new Direccion("C/ Aragon", "40","07005","Palma de Mallorca",
				"Baleares", "España"),"871 956 125","luis@gmail.com","45612587-D");
		
		
		Venta venta1 = new Venta(new Articulo("HP Envy 15", 750), 1);
		Venta venta2 = new Venta(new Articulo("Cable USB 3m", 8), 2);
		Venta venta3 = new Venta(new Articulo("Teléfono móvil Xiaomi", 215), 1);

		Factura factura = new Factura();
		factura.setEmpresa(empresa);
		factura.setFecha("20 de febrero de 2018");
		factura.setComprador(cliente);

		factura.addVenta(venta1);
		factura.addVenta(venta2);
		factura.addVenta(venta3);
		//factura.addVenta(venta3);

		factura.imprimir();

	}

}