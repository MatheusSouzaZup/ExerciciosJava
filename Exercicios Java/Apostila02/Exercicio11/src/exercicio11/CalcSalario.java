
package exercicio11;


public class CalcSalario {
    final int totaldias = 22;
    double salario;
    int numdiastrabson;
    double salariototal;
    
    public void calculaSalario() {
       salariototal = numdiastrabson * (salario/totaldias);
    }

    public double getSalariototal() {
        return salariototal;
    }

    public void setSalariototal(double salariototal) {
        this.salariototal = salariototal;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumdiastrabson() {
        return numdiastrabson;
    }

    public void setNumdiastrabson(int numdiastrabson) {
        this.numdiastrabson = numdiastrabson;
    }

}
