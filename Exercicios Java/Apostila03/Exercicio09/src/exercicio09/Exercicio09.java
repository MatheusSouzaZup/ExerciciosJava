
package exercicio09;
import java.util.Scanner;

public class Exercicio09 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        String a;
        System.out.println("Insira 1 parametro: ");
        a = ler.nextLine();
        if("".equals(a)) {
            System.out.println("Nada digitado!");
        }
        else {
            System.out.println(a);
        }
       
    }
    
}
