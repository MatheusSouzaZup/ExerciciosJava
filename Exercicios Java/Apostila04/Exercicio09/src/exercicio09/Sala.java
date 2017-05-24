
package exercicio09;


public class Sala {
    private String sala;
    private Aluno[] alunos = new Aluno[10];
    int indice;
    
    public Sala() {
        indice = 0;
    }
    
    public void inserevet(Aluno aluno) {
        alunos[indice] = aluno;
        indice++;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public void changeAlunoSala(Sala atual, Sala destino,Aluno aluno){
        
    }
    
}
