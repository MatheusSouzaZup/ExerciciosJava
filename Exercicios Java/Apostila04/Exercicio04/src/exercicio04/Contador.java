
package exercicio04;

    
public class Contador {
    private int valorinicial;
    private int valor;
    
    public Contador(int valorinicial) {
        this.valorinicial = valorinicial;
        this.valor = valorinicial;
    }
    
    public void incrementar() {
       valor++;
    }
    public void decrementar() {
       valor--;
    }
    public int printatual() {
        return valor;
    }
    public int printinicial() {
        return valorinicial;
    }
    //Getters e Setters
    public int getValorinicial() {
        return valorinicial;
    }

    public void setValorinicial(int valorinicial) {
        this.valorinicial = valorinicial;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
   
}
