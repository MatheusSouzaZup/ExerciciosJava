
package exercicio20;


public class PrintStars {
    public void print() {
        for(int i=0; i<10;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printinverso(){
        for(int i=0; i<10;i++) {
            for(int j=10; j>i ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public void printespacoinvertidoesquerda(){
        for(int i=0; i<10;i++) {
          for(int k=0;k<i ;k++) {
                    System.out.print(" ");
                }
            for(int j=10; j>i ;j--){
                System.out.print("*");

            }
 
           System.out.println();

        }
        
    }
            public void printespaco() {
        for(int i=0; i<10;i++) {
             for(int k=10;k>i ;k--) {
                    System.out.print(" ");
                }
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
