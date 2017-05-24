
package exercicio01;


public class Calculo {
    
    String expression;
    int resultado;
    
    public void makethemath()
    {
        char[] charArray = expression.toCharArray();
        int[] intArray = new int[charArray.length]; 
        int i = 0;
            while(i <charArray.length)
            {
                        if(charArray[i] == '+') {
                            resultado = resultado + Character.getNumericValue(charArray[i]);
                        }
                        if(charArray[i] == '-') {
                            resultado = resultado - Character.getNumericValue(charArray[i]);
                        }
                i++;
            }
    }
    public int[] readtheexpression() {
        char[] charArray = expression.toCharArray();
        int[] positions = new int[2];
        char sinal;
        int i = 0;
        for(char c : charArray) {
               if(c== '*') {
               positions[0] = i-1;
               sinal = c;
               positions[1] = i+i;
               }
               else if( c == '/') {
               positions[0] = i-1;
               sinal = c;
               positions[1] = i+i;
               }
               else if(c == '%') {
               positions[0] = i-1;
               sinal = c;
               positions[1] = i+i;
               }
        }
    }
    public int firstCalc(int valor1, int valor2, char sinal){
        if(sinal == '*' ) {
            return valor1 * valor2;
        }
        else if(sinal == '/' ){
          return valor1 / valor2;   
        }
        else {
            return valor1 % valor2;
        }
    }
    public char[] newExpression(char[] charArray,int[] pos,char sinal) {
        int i =0;
        char[] newExp = new char[charArray.length];
        while(i<charArray.length) {
            if(i!=pos[0] && i!=pos[1]) {
                newExp[i] = charArray[i];
                i++;
            }
            if(i==pos[0] && i<i+2) {
                newExp[i] = (char) firstCalc(pos[0],pos[1],sinal);
                i = i+2;
            } 
        }
        return newExp;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}


