
package exercicio04;


public class Exercicio04 {

 
    public static void main(String[] args) {
        Contador contador = new Contador(5);

        System.out.println("Valor Atual :" + contador.printatual());
        contador.incrementar();
        contador.incrementar();
        System.out.println("Valor Atual :" + contador.printatual());
        System.out.println("Valor Inicial : "+ contador.getValorinicial());
        contador.decrementar();
        System.out.println("Valor Atual :"+ contador.printatual());
        System.out.println("Valor Inicial : "+ contador.getValorinicial());
      
    }
    
}
