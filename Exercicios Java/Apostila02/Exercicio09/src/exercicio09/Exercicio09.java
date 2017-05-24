
package exercicio09;
import java.util.Scanner;

public class Exercicio09 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.println("Digite 1 numero com até 4 casas!");
      String mystring = ler.next();
      char[] charArray = mystring.toCharArray();
      char[] charArrayinverso = new char[charArray.length];
      if(charArray.length > 4) {
        System.out.println("Numero Invalido");
           return;
      }
      int i=3;
      for(char c: charArray) {
          charArrayinverso[i] = c;
          i--;
      }
      String myString = new String(charArrayinverso);
      System.out.println(myString);
    }
    
}
