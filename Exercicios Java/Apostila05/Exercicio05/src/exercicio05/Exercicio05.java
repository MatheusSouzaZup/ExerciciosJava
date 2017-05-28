
package exercicio05;
import java.util.Random;
public class Exercicio05 {

    
    public static void main(String[] args) {
        Random gerador = new Random();
 
        int numero = gerador.nextInt(100);
        int numero2 = gerador.nextInt(100);
            if(numero > numero2 ) {
                System.out.println("Numero 1: " + numero + "Maior que Numero 2: "+ numero2);
            }
            else if(numero == numero2) {
                System.out.println("Os numeros tem o mesmo valor!");
            }
            else {
                System.out.println("Numero 2: " + numero2 + "Maior que Numero 1 : "+ numero);
            }
    }
    
}
