
package exercicio02;


public class FunifArray {
        final int[] array ={5,10,15,20,25,30,35,40,45,50};
        public double calcmedia(){
            double media = 0;
            for(int x : array) {
                 media = media + x;
            }
            media = media / array.length;
            return media;
        }
}
