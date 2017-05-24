
package exercicio07;
import java.util.Arrays;

public class FunifArray {
    int[] array = new int[10];
    
    public void ordenavetor() { 
        Arrays.sort(array);
    }
    
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
}
