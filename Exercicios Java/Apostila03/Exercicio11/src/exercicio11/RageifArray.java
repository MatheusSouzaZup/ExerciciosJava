
package exercicio11;

public class RageifArray {
        int[] vet = new int[11];
        
        public int[] verifyfreq() {
            int i = 0;
            int[] cont = new int[vet.length];
            for(int x : vet) {
                for(i=0;i<vet.length;i++) {
                    if(vet[i] == x) {
                        cont[i]= cont[i]+1;
                    }
                }
            }
            return cont;
        }

    public int[] getVet() {
        return vet;
    }

    public void setVet(int[] vet) {
        this.vet = vet;
    }
        
        
}
