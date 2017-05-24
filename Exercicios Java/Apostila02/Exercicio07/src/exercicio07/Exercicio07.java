
package exercicio07;


public class Exercicio07 {
    
    static ParImpar parimpar = new ParImpar();
    public static void main(String[] args) {
        long impar = 1;
        long par = 2;
        int mycont = 1;
        System.out.println("Impar");
        while(impar<=30) {
            System.out.println(parimpar.getimpar(impar));
            impar = impar + 2;
        }
        System.out.println("Par");
        for(int cont=2;cont<=30;cont=cont+2) {
            par = parimpar.getpar(par, cont);
            System.out.println(par);
        }
    }
    
}
