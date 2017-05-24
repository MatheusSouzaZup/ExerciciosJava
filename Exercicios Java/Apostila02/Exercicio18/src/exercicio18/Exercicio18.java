
package exercicio18;
import java.util.Scanner;

public class Exercicio18 {

    static Scanner ler = new Scanner(System.in);
    static MaketheMath mtm = new MaketheMath();
    public static void main(String[] args) {
       System.out.print("Entre com o valor da Aplicação: ");
       mtm.setAplicacao(ler.nextDouble());
       System.out.print("Entre com o valor de retorno Desejado: ");
       mtm.setRetorno(ler.nextDouble());
       mtm.calcNumMeses();
       System.out.println("O numero de meses para a aplicação chegar ao retorno Desejado é de:"+
               mtm.getNumeses()+" meses");
    }
    
}
