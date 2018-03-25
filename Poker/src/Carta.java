
public class Carta {
	
	private String valores []= {" ","As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Dies","Sota","Queen","King"};
	private String palos []= {"Diamantes","Corazones","Picas","Treboles"};
	private int valor;
	private int palo;
	
	
	public static void main(String[] args) {
		Carta c1 = new Carta (5,2);
		Carta c2 = new Carta (4,3);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println("\nComparando cartas");
		if (Carta.compara(c1, c2)){
			System.out.println("La cartas son iguales");
		}else {
			System.out.println("Son cartas distintas");
		}
		
	}
	
	public Carta(int valor, int palo) {
		this.valor=valor;
		this.palo=palo;
	}
	
	static public boolean compara(Carta a, Carta b) {
		if (a.valor == b.valor && a.palo== b.palo) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString () {
		return valores[valor]+" de "+palos[palo];
	}
	
	// METODOS GET /SET
	
	public int getValor() {
		return valor;
	}
	public int getPalo() {
		return palo;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void setPalo(int palo) {
		this.palo = palo;
	}

}
