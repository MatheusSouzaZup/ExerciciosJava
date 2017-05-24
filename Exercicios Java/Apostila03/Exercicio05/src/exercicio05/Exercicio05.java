
package exercicio05;

public class Exercicio05 {

    static FunifArray fif = new FunifArray();
    public static void main(String[] args) {
        boolean flag;
       flag = fif.compare();
       if(flag = true){
           System.out.println("Os Arrays são iguais!");
       }
       else {
           System.out.println("Os Arrays são diferentes!");
       }
    }
    
}
