
package exercicio05ao11;
import java.util.List;

public class CalculaGastosSalarios {
       
    public double calculaGastoSalarios(List<Funcionario> lista) {
            double total = 0.0;
            
            for(Funcionario f : lista) {
                 total = total + f.salarioFinal();
            }
        return total;
    } 
}
