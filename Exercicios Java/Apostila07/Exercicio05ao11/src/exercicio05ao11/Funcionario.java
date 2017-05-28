
package exercicio05ao11;


public class Funcionario {
        final double rendabasica = 1000.00;
        final double gerente = 1500.00;
        final double supervisor = 600.00;
        final double vendedor = 250.00;
        private String escolaridade;
        private String nome;
        private String codfuncional;
        private String nomeinsensino;
        private String cargo;


        
        
    public double salario() {
            if("Basico Incompleto".equals(escolaridade)) {
                return rendabasica;
            }
            else if("Basico Completo".equals(escolaridade)) {
                return rendabasica + (rendabasica * 0.1);
            }
            else if("Medio Completo".equals(escolaridade)) {
                return rendabasica + (rendabasica * 0.5);
            }
            else  {
                return rendabasica * 2;
            }
            
    }
    
    public double salarioFinal() {
          if("Gerente".equals(cargo)) {
              return gerente + salario();
          }
          else if("Supervisor".equals(cargo)) {
              return supervisor + salario();
          }
          else {
              return vendedor + salario();
          }
    }
    
        @Override
    public String toString() {
        if("Gerente".equals(cargo)) {
            return "Nome:     " + nome + "\n" +
                   "Comissão: " + gerente + "\n" +
                   "Salario Final: " + salarioFinal();
        }
        else if("Supervirsor".equals(cargo)) {
            return "Nome:     " + nome + "\n" +
                   "Comissão: " + supervisor + "\n" +
                   "Salario Final: " + salarioFinal();
        }
        else {
            return "Nome:     " + nome + "\n" +
                   "Comissão: " + vendedor + "\n" +
                   "Salario Final: " + salarioFinal();
        }
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNomeinsensino() {
        return nomeinsensino;
    }

    public void setNomeinsensino(String nomeinsensino) {
        this.nomeinsensino = nomeinsensino;
    }
   
    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodfuncional() {
        return codfuncional;
    }

    public void setCodfuncional(String codfuncional) {
        this.codfuncional = codfuncional;
    }
        
        
}
