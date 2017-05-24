
package exercicio16;


public class Exercicio16 {

    static Conta conta = new Conta();
    public static void main(String[] args) {
        boolean flag;
        conta.setLimite(1000.00);
        conta.setSaldo(250.00);
        flag = conta.sacar(25.00);
        if(flag == true){
           System.out.println("Saque efetuado com Sucesso");
        }
        else{
            System.out.println("Voce não tem Saldo!");
        }
    }
    
}
