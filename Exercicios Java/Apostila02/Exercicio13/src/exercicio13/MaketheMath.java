
package exercicio13;


public class MaketheMath {
    
        public long calcFatorial(long n) {
            long fat;
            for(fat = 1;n>1; n=n-1) {
                fat = fat*n;
            }
            return fat;
        }
        public double calcRaizQuad(double n) {
           return Math.sqrt(n);
        }
        public void calcTabuada() {
            for(int i=1; i <11; i++) {
                System.out.println("Tabuada do" + i);
                for(int j= 1; j<11;j++) {
                    System.out.println(i +"* "+ j +"= " + i*j);
                }
            }
        }
        

}
