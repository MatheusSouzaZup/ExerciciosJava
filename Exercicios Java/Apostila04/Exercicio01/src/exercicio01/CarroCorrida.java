
package exercicio01;

public class CarroCorrida {
    private int numeroid;
    private double velocidadeAtual = 0.0;
    private double velocidadeMaxima = 100.0;
    private Piloto piloto = new Piloto();
    private Motor motor = new Motor();


    
    public CarroCorrida(int numeroid, double veloMax) {
        this.numeroid = numeroid;
        this.velocidadeMaxima = veloMax;
    }
    public CarroCorrida(double veloMax) {
        this.velocidadeMaxima = veloMax;
    }
    public void acelerar() {
        velocidadeAtual +=10 + (piloto.getHabilidade()*0.1) + (motor.getPotencia()*0.1);
            if(velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
    }
   
    //GETERS e SETTERS
    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public int getNumeroid() {
        return numeroid;
    }

    public void setNumeroid(int numeroid) {
        this.numeroid = numeroid;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
}
