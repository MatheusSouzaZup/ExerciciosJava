
package exercicio01ao04;


public class StringClass {
        String minhastring;
        
    public String verifySize() {
        if(minhastring.length() <= 4) {
            return "É menor que 4 letras";
        }
        else {
            return "É maior que 4 letras";
        }
    }
    
    public String verifyFirstLetter() {
        if(minhastring.charAt(0) == 'A') {
            return "A primeira letra é A!";
        }
        else {
            return "A primeira letra não é A!";
        }
    }
    public String changeFourLetters() {
        String aux="";
        for(int i=0;i<4; i++) {
            aux += minhastring.charAt(i);
        }
        return aux;
    }
    public boolean verifyNumber() {
    // cria um array de char
    char[] c = minhastring.toCharArray();
    boolean d = true;
    for ( int i = 0; i < c.length; i++ )
        // verifica se o char não é um dígito
        if ( !Character.isDigit( c[ i ] ) ) {
            d = false;
            break;
        }
        return d;
    }
    
    public String getMinhastring() {
        return minhastring;
    }

    public void setMinhastring(String minhastring) {
        this.minhastring = minhastring;
    }
        
    
}
