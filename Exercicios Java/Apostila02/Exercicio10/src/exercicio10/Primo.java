
package exercicio10;


public class Primo {
    
    public boolean getprimo(long numero) {
        double aux;
            aux = numero % 2;
            if(aux==0) {
                return false;
            }
            else{
                return true;
            }
    }

}
