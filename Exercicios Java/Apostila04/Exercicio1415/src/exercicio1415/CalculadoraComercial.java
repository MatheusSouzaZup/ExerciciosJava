
package exercicio1415;


public class CalculadoraComercial extends Calculadora{
     private int valorporcentagem;
    
    public void calcporcentagem(double valor1 , double valor2) {

          valorporcentagem =  (int) ((valor2*100)/valor1);
    }
    public int getValorporcentagem() {
        return valorporcentagem;
    }

    public void setValorporcentagem(int valorporcentagem) {
        this.valorporcentagem = valorporcentagem;
    }
        
    
}
