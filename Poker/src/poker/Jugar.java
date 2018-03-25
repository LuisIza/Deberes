package poker;
import poker.Carta;

public class Jugar {
    
    public static void main(String[] args) {
        Carta c1 = new Carta (5,2);
        Carta c2 = new Carta (4,3);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        System.out.println("\nComparando cartas");
        
        if (c1.compara(c2)){
            System.out.println("La cartas son iguales");
        }else {
            System.out.println("Son cartas distintas");
        }
        
    }
    
}
