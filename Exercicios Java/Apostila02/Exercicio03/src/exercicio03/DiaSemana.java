
package exercicio03;


public class DiaSemana {
    
    public String getdia(int dia) {
        switch(dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-Feira";
            case 3:
                return "Terça-Feira";
            case 4:
                return "Quarta-Feira";
            case 5:
                return "Quinta-Feira";
            case 6: 
                return "Sexta-Feira";
            case 7:
                return "Sabado";
            default:
                return "Este não é 1 numero valido";
        }
    }
    
}
