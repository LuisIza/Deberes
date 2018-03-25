package baraja;
public class Carta {
	public static final String VALORES []= {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Dies","Sota","Queen","King"};
    public static final String PALOS []= {"Diamantes","Corazones","Picas","Treboles"}; 
    private  int valor;
    private  int palo;
    
    public Carta () {
    	
    }
    public Carta(int valor, int palo) {
        this.valor=valor;
        this.palo=palo;
    }
    
    public String toString () {
        return VALORES[valor]+" de "+PALOS[palo];
    }
    
    // METODOS GET /SET
    
    public int getValor() {
        return valor;
    }
    public int getPalo() {
        return palo;
    }
    
}