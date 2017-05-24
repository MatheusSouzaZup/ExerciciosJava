
package exercicio10;

import java.util.Scanner;
public class Exercicio10 {

    static Scanner ler = new Scanner(System.in);
    static FunifArray fia = new FunifArray();
    public static void main(String[] args) {
         boolean flag;
         System.out.println("Insira o primeiro vetor com 10 valores: ");
         fia.setVet1(insertvalues(11));
         System.out.println("Insira o primeiro vetor com 5 valores: ");
         fia.setVet1(insertvalues(6));
         flag = fia.verifyvets();
         if(flag) {
            System.out.println("Contem");
         }
         else{
              System.out.println("O segundo vetor contem no primeiro!");
         }
    }
    public static int[] insertvalues(int qtd) {
        int[] vet = new int[qtd];
        int i = 1;
        while(i < qtd) {
            System.out.print("Insira"+ i +"valor: ");
            vet[i] = ler.nextInt();
            i++;
        }
        return vet;
    }
    
}
