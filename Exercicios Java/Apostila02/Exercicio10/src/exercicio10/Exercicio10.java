
package exercicio10;
import java.util.Scanner;

public class Exercicio10 {

    static Scanner ler = new Scanner(System.in);
    static Primo primobj = new Primo();
    public static void main(String[] args) {
       int primo;
       boolean flag;
       primo = ler.nextInt();
       flag = primobj.getprimo(primo);
       if(flag == true){
           System.out.println("Numero Primo!");
       }
       else {
           System.out.println("Numero não é Primo!");
       }
    }
    
}
