/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;
import java.util.Scanner;
public class Exercicio03 {

    static Scanner ler = new Scanner(System.in);
    static DiaSemana dia = new DiaSemana();
    public static void main(String[] args) {
        int var;
        do{
           var = ler.nextInt();
       System.out.println(dia.getdia(var));
        }while(var != 0);
    }
    
}
