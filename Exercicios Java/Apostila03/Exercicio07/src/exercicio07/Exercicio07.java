
package exercicio07;
import java.util.Scanner;

public class Exercicio07 {

    static Scanner ler = new Scanner(System.in);
    static FunifArray fia = new FunifArray();
    public static void main(String[] args) {
        int cont = 0;
        int[] vet = new int[10];
        while(cont<=9) {
            System.out.print("Insira um numero: ");
            vet[cont] = ler.nextInt();
            cont++;
        }
        fia.setArray(vet);
        fia.ordenavetor();
        printvet();
        
    } 
    public static void printvet() {
       int[] vet = fia.getArray();
       System.out.println("Vetor Ordenado.");
       for(int x : vet) {
           System.out.println(x);
       }
    }
    
}
