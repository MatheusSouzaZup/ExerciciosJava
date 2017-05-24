
package exercicio11;
import java.util.Scanner;
public class Exercicio11 {

    static Scanner ler = new Scanner(System.in);
    static CalcSalario obj = new CalcSalario();
    public static void main(String[] args) {
        String msg;
        System.out.print("Informa o Salario Mensal: ");
        obj.setSalario(ler.nextDouble());
        System.out.print("Informe o Numeros de Dias Trabalhados: ");
        obj.setNumdiastrabson(ler.nextInt());
        obj.calculaSalario();
        System.out.println();
        msg = String.format("%.2f", obj.getSalariototal());
        System.out.println("O Salario é: " + msg);
    }
    
}
