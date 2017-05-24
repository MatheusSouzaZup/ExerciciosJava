
package exercicio1415;


public class Exercicio1415 {

    static CalculadoraComercial cc = new CalculadoraComercial();
    public static void main(String[] args) {
       cc.setValor1(10);
       cc.setValor2(20);
       cc.somar();
       System.out.println("Somar: "+ cc.getResultado());
       cc.calcporcentagem(220.00, 70.00);
       System.out.println("Valor Porcentagem: " + cc.getValorporcentagem());
    }
    
}
