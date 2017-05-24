
package exercicio16;


public class Conta {
    private String numconta;
    private double saldo, limite;
    private Pessoa pessoa;
    
    public Conta() {
        
    }
    public Conta(String numconta, double saldo, double limite, Pessoa pessoa) {
        this.numconta = numconta;
        this.saldo = saldo;
        this.limite = limite;
        this.pessoa = pessoa;
    }
    public boolean sacar(double valor) {
        if(valor <= saldo) {
            return true;
        }
        else {
            return false;
        }
    }
    public void depositar(double valor){
        saldo += valor;
    }

    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(String numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
