
package exercicio10;

import java.util.Arrays;
public class FunifArray {
    int[] vet1 = new int[11];
    int[] vet2 = new int[6];
    
    public boolean verifyvets() {
        
        if(Arrays.asList(vet2).contains(vet1)) {
            return true;
        }
        else {
            return false;
        }    
    }

    public int[] getVet1() {
        return vet1;
    }

    public void setVet1(int[] vet1) {
        this.vet1 = vet1;
    }

    public int[] getVet2() {
        return vet2;
    }

    public void setVet2(int[] vet2) {
        this.vet2 = vet2;
    }
    
   
}
