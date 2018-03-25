package poker;
public class Carta {
    
    private  int valor;
    private  int palo;
    
    public Carta(int valor, int palo) {
        this.valor=valor;
        this.palo=palo;
    }
    
    public boolean compara(Carta otra) {
        if (valor == otra.valor && palo== otra.palo) {
            return true;
        }else {
            return false;
        }
    }
    
    public String toString () {
        String valores []= {" ","As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Dies","Sota","Queen","King"};
        String palos []= {"Diamantes","Corazones","Picas","Treboles"};
        return valores[valor]+" de "+palos[palo];
    }
    
    // METODOS GET /SET
    
    public int getValor() {
        return valor;
    }
    public int getPalo() {
        return palo;
    }
    
}
