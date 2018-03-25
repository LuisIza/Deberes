package baraja;
import baraja.Carta;
public class Baraja {
	
	private Carta []cartas= new Carta [52];
	
    public Baraja() {
       
    }
    
    public void ordenar() {
    	int contador = 0; 
    	for (int i = 0; i < 4 ; i++) {
			for (int j= 0; j <13 ; j++) {
				cartas[contador]= new Carta(j,i);
				contador++;
			}
		}
    }
    
    public void barajar() {
    	int num1=0;
    	int num2=0;
    	Carta aux;
    	for (int i=0; i<100; i++) {
    		num1 = (int) (Math.random()*52) ;
    		num2 = (int) (Math.random()*52);
    		aux = cartas [num1];
    		cartas [num1]= cartas [num2];
    		cartas [num2]= aux;
    	}
    	
    }
    public void cortar () {
    	int cortar = (int) (Math.random()*40) ;
    	System.out.println(cortar);
    	
    	Carta []cortarcartas= new Carta [cortar];
    	for (int i = 0; i < cortar; i++) {
			cortarcartas[i]= cartas[i];
		}
    	int j=cortar;
    	
    	for (int i = 0; i <cartas.length-cortar; i++) {
    			cartas[i]= cartas[j];
    			j++;	
		}
    	int otrocontador= cartas.length-cortar;
    	for (int i = 0; i < cortarcartas.length; i++) {
			cartas[otrocontador]= cortarcartas[i];
			otrocontador++;
		}
    	
    	
    	
    }
    
    public void extraer() {
    	System.out.println(cartas[0]);
    }
    public void mostrar () {
    	
    	for (int i = 0; i < 13; i++) {
    		
			System.out.println(cartas[i] +"    \t" + cartas[i+13] + "    \t" + cartas[i+26]+ "    \t" + cartas[i+39]);
		}
    }
}
