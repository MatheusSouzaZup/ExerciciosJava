
package exercicio03;


public class FunifArray {
        final int[] array ={5,10,15,20,25,30,35,40,45,50};
        public long calc(){
            long aux = 1;
            for(int x : array)
            {
                aux = aux * x;
            }
            return aux;
        }
}
