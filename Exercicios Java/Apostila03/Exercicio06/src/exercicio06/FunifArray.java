
package exercicio06;


public class FunifArray {
        double[] vet1 = {3.5,5.5,8.1,1.2};
        double[] vet2 = {4.5,7.5,5.1,6.2};
        double result = 0;
        
        public double calcvets() {
           for(int i=0; i<vet1.length;i++) {
               result = result + (vet1[i] * vet2[i]);
           }
            return result;
        }        
}
