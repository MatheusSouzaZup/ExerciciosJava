
package exercicio18;


public class MaketheMath {
    final double constante = 0.05;
    double aplicacao;
    double retorno;
    int numeses;
    
    public void calcNumMeses(){
        double aux = 0;
        int cont = 0;
        while(aplicacao < retorno) {
            aplicacao = aplicacao + (aplicacao * constante);
            cont++;
        }
           setNumeses(cont); 
    }

    public double getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(double aplicacao) {
        this.aplicacao = aplicacao;
    }

    public double getRetorno() {
        return retorno;
    }

    public void setRetorno(double retorno) {
        this.retorno = retorno;
    }

    public int getNumeses() {
        return numeses;
    }

    public void setNumeses(int numeses) {
        this.numeses = numeses;
    }

}
