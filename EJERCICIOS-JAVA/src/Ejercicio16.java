import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese año? ");
		int anyo = entrada.nextInt();
		System.out.println("Ingrese el mes? ");
		int mes = entrada.nextInt();
		int biciesto = anyo%4;
		String mess="";
		int dias=0;
		
		if (biciesto == 0) {
			switch (mes) {
			case 1:
				mess ="Enero";
				dias=31;
			break;
			case 2:
				mess ="Febrero";
				dias=29;
			break;
			case 3:
				mess ="Marzo";
				dias=31;
			break;
			case 4:
				mess ="Abril";
				dias=30;
			break;
			case 5:
				mess ="Mayo";
				dias=31;
			break;
			case 6:
				mess ="Junio";
				dias=30;
			break;
			case 7:
				mess ="Julio";
				dias=31;
			break;
			case 8:
				mess ="Agosto";
				dias=31;
			break;
			case 9:
				mess ="Septiembre";
				dias=30;
			break;
			case 10:
				mess ="Octubre";
				dias=31;
			break;
			case 11:
				mess ="Noviembre";
				dias=30;
			break;
			case 12:
				mess ="Diciembre";
				dias=31;
			break;
			}
			
		}else {
			switch (mes) {
			case 1:
				mess ="Enero";
				dias=31;
			break;
			case 2:
				mess ="Febrero";
				dias=28;
			break;
			case 3:
				mess ="Marzo";
				dias=31;
			break;
			case 4:
				mess ="Abril";
				dias=30;
			break;
			case 5:
				mess ="Mayo";
				dias=31;
			break;
			case 6:
				mess ="Junio";
				dias=30;
			break;
			case 7:
				mess ="Julio";
				dias=31;
			break;
			case 8:
				mess ="Agosto";
				dias=31;
			break;
			case 9:
				mess ="Septiembre";
				dias=30;
			break;
			case 10:
				mess ="Octubre";
				dias=31;
			break;
			case 11:
				mess ="Noviembre";
				dias=30;
			break;
			case 12:
				mess ="Diciembre";
				dias=31;
			break;
			}
		}
		System.out.println("En el año "+ anyo +" el mes de " + mess + " tiene " + dias);
	}

}
