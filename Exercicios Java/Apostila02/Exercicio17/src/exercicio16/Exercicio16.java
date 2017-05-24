
package exercicio16;
import java.util.Scanner;
public class Exercicio16 {

    static Scanner ler = new Scanner(System.in);
    static MaketheMath mtm = new MaketheMath();
    public static void main(String[] args) {
         System.out.println("Calcule a Area do Trapezio");
         System.out.print("Altura: ");
         mtm.setAltura(ler.nextDouble());
         System.out.print("Base menor: ");
         mtm.setBase(ler.nextDouble());
         System.out.print("Base Maior: ");
         mtm.setBasemaior(ler.nextDouble());
         mtm.calculo();
         System.out.println("A Area é: " + mtm.getArea());
         
    }
    
}
