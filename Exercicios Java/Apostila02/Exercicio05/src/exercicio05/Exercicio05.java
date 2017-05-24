
package exercicio05;

import java.util.Scanner;
public class Exercicio05 {

     static Scanner ler = new Scanner(System.in);
     static Mes mes = new Mes();
    public static void main(String[] args) {
              int var;
        do{
           var = ler.nextInt();
       System.out.println(mes.getmes(var));
        }while(var != 0);
    }
    
}
