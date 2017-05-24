
package exercicio01;

public class Motor {
    private int potencia;
    
    public Motor() {
        
    }
    
    public Motor(int potencia) {
        this.potencia = potencia;
     
    }
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public boolean testarange() {
        if(this.potencia >=1 && this.potencia <=100) {
            return true;
        }
        else {
            return false;
        }
    }
    public void msgoutofrange() {
        System.out.println("Valor fora do lime. 0 a 100");
    }
    
}
