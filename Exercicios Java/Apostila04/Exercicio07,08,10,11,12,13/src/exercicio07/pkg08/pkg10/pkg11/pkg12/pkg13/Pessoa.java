
package exercicio07.pkg08.pkg10.pkg11.pkg12.pkg13;


public class Pessoa {
    String nome, idade, cpf;
    Endereco end;
    
    public Pessoa(String nome,String idade, String cpf, Endereco end) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.end = end;
        
    }

    public String toString(){
        return  "Dados Pessoais \n"+
                "Nome   : " + nome +"\n"+
                "Cpf   : " + cpf  +"\n"+
                "Idade : " + idade+"\n"+
                "Endereco \n" + 
                end.toString();
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
