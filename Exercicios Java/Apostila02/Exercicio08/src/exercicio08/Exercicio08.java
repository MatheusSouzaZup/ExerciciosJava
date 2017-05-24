
package exercicio08;


public class Exercicio08 {


    public static void main(String[] args) {
        int cont1 = 0; int cont2= 0;
        for(cont1 = 0;cont1<10;cont1++) {
            for(cont2 = 0; cont2<10;cont2++) {
                if(cont1 ==cont2) {
                    break;
                }
                else {
                    System.out.println("Contador1: " + cont1 + "\n" + "Contador2: " + cont2);
                }
            }
        }
    }
    
}
