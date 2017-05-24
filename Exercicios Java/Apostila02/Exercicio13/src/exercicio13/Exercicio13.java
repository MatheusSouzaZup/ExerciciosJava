
package exercicio13;
import java.util.Scanner;

public class Exercicio13 {

    static Scanner ler = new Scanner(System.in);
    static MaketheMath mtm = new MaketheMath();
    public static void main(String[] args) {
       menu();
    }
    public static void menu() {
        int op=4;

        do{
        printmenu();
            op = ler.nextInt();
            switch(op) {
                case 1:
                    System.out.print("Insira 1 numero para o Calculo do Fatorial: ");
                    System.out.println("O Fatorial é: " + mtm.calcFatorial(ler.nextLong()));
                    break;
                case 2:
                    System.out.print("Insira 3 numeros, para calcular a Raiz Quadrada: ");
                    raiz();
                    break;
                case 3:
                    mtm.calcTabuada();
                    break;
                default:
                    System.out.println("Digite 1 Numero Valido");
            }
        }while(op!=4);
    }
    public static void printmenu() {
        System.out.println(
        "Esolha uma das opçoes abaixo. \n"+
        "1 - Calcular Fatorial \n" +
        "2 - Calcular Raiz Quadrada \n" +
        "3 - Tabuada de 1 a 10 \n" +
        "4 - Sair");
    }
    public static void raiz() {
        int i =0;
        do{
            System.out.println("Raiz = " + mtm.calcRaizQuad(ler.nextDouble()));
            i++;
        }while(i<3);
    }
    
}
