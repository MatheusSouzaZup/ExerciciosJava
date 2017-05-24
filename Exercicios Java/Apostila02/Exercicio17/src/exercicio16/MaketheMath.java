
package exercicio16;


public class MaketheMath {
    final int constante = 2;
    double altura,base,basemaior,area;
    
    public void calculo() {
        area = (altura*(base+basemaior))/constante;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBasemaior() {
        return basemaior;
    }

    public void setBasemaior(double basemaior) {
        this.basemaior = basemaior;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
        

}
