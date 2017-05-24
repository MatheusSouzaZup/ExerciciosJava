
package exercicio05;


public class FunifArray {
        final boolean[] array ={true,true,false,true,true,false,false,false,true,true};
        final boolean[] segundoarray ={true,true,false,true,true,false,false,false,true,true};
        public boolean compare() {
               boolean flag = true;
               if(array.length == segundoarray.length) {
                for(int i=0;i<array.length;i++) {
                        if(array[i] == segundoarray[i]) {
                            flag = true;
                        }
                        else {
                            flag = false;
                            return flag;
                        }
                    }
               }
               else{
                   flag = false;
                   return flag;
               }
               return flag;
        }
}
