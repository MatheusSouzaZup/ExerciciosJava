
package exercicio07.pkg08.pkg10.pkg11.pkg12.pkg13;


public class Endereco {
    String estado, cidade,bairro,rua,cep,telefone;
    
    public String toString(){
        return "Cidade   :" + cidade + "\n" +
                "Cep     :" + cep + "\n"    +
                "Bairro  :" + bairro + "\n" +
                "Rua     :" + rua + "\n"    +
                "Telefone:" + telefone + "\n";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
