
package exercicio4;


public class FunifArray {
        final int[] array ={5,10,15,20,25,30,35,40,45,50};
        public void invert(){
            int i = array.length;
            int[] arrayinvert = new int[i];
            i--;
            
            for(int x : array) {
                arrayinvert[i] = x;
                i--;
            }
            for(int x : arrayinvert) {
                System.out.println(x);
            }
        }
}
