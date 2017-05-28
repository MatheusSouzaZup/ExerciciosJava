
package exercicio01;


public abstract class Animal {
    String nome,idade;
    
    public abstract String emitirSom();
    
    public String animalAction() {
        return "Correr";
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
}
