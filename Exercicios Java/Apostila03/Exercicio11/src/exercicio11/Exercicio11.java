
package exercicio11;
import java.util.Scanner;

public class Exercicio11 {

    static Scanner ler = new Scanner(System.in);
    static RageifArray ria = new RageifArray();
    public static void main(String[] args) {
        
       ria.setVet(insertvet(10));
       printfreq(ria.verifyfreq());
    }
    public static int[] insertvet(int qtd) {
        int i = 0;
        int[] vet = new int[qtd];
        while(i < qtd) {
            System.out.print("Insira 1 numero: ");
            vet[i] = ler.nextInt();
            i++;
        }
        return vet;
    }
    public static void printfreq(int[] vet) {
        for(int x : vet) {
            System.out.println(x);
        }
    }
    
}
