
package exercicio07.pkg08.pkg10.pkg11.pkg12.pkg13;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio070810111213 {
    
    static Scanner ler = new Scanner(System.in);
    List<Pessoa> mlist = new ArrayList<Pessoa>();
    public static void main(String[] args) {
     instanciadois();
        
    }
    public static void instanciadois() {
        Pessoa pessoa1 = populacampos();
        Pessoa pessoa2 = populacampos();
        print(pessoa1);
        print(pessoa2);
    }
    public static Pessoa populacampos() {
        Endereco end = new Endereco();
        end.setCidade(ler.nextLine());
        end.setCep(ler.nextLine());
        end.setBairro(ler.nextLine());
        end.setRua(ler.nextLine());
        end.setTelefone(ler.nextLine());
        
        Pessoa pessoa = new Pessoa(ler.next(),ler.next(),ler.next(), end);
        return pessoa;
    }
    public static void print(Pessoa pessoa) {
        System.out.println(pessoa.toString());
    }
    
}
