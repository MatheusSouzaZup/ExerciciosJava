
package exercicio05ao11;
import java.util.List;
import java.util.ArrayList;

public class Exercicio05ao11 {
    public static CalculaGastosSalarios cgs = new CalculaGastosSalarios();
    
    public static void main(String[] args) {
       exercicio07();
    }
    public static void exercicio07() {
       List<Funcionario> lista = insertList(); 
       printList(lista);
       printGastos(lista);
    }
    public static List<Funcionario> insertList() {
        List<Funcionario> lista = new ArrayList<Funcionario>();
        Funcionario novo;
        //1
        novo = new Funcionario();
        novo.setNome("Katniss");
        novo.setEscolaridade("Basico Incompleto");
        novo.setCodfuncional("1231");
        novo.setCargo("Vendedor");
        novo.setNomeinsensino("Nenhuma");
        lista.add(novo);
        //2
        novo = new Funcionario();
        novo.setNome("Peeta");
        novo.setEscolaridade("Basico Incompleto");
        novo.setCodfuncional("1232");
        novo.setCargo("Vendedor");
        novo.setNomeinsensino("Nenhuma");
        lista.add(novo);
        //3
        novo = new Funcionario();
        novo.setNome("Harry Potter");
        novo.setEscolaridade("Medio Completo");
        novo.setCodfuncional("1233");
        novo.setCargo("Supervisor");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
        //4
        novo = new Funcionario();
        novo.setNome("Ronald Weasley");
        novo.setEscolaridade("Medio Completo");
        novo.setCodfuncional("1234");
        novo.setCargo("Supervisor");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
        //5
        novo = new Funcionario();
        novo.setNome("Hermione Granger");
        novo.setEscolaridade("Universidade Completa");
        novo.setCodfuncional("1131");
        novo.setCargo("Gerente");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
        //6
        novo = new Funcionario();
        novo.setNome("Gina Wesley");
        novo.setEscolaridade("Universidade Completa");
        novo.setCodfuncional("1132");
        novo.setCargo("Gerente");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
        //7
        novo = new Funcionario();
        novo.setNome("Neville Longbottom");
        novo.setEscolaridade("Universidade Completo");
        novo.setCodfuncional("1133");
        novo.setCargo("Gerente");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
        //8
        novo = new Funcionario();
        novo.setNome("Luna Lovegood");
        novo.setEscolaridade("Universidade Completa");
        novo.setCodfuncional("1134");
        novo.setCargo("Supervisor");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
        //9
        novo = new Funcionario();
        novo.setNome("Fred Weasley");
        novo.setEscolaridade("Medio Completo");
        novo.setCodfuncional("1236");
        novo.setCargo("Vendedor");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
        //10
        novo = new Funcionario();
        novo.setNome("Fred Weasley");
        novo.setEscolaridade("Medio Completo");
        novo.setCodfuncional("1237");
        novo.setCargo("Vendedor");
        novo.setNomeinsensino("Hogwarts");
        lista.add(novo);
       
        return lista;
    }
    
    public static void printList(List<Funcionario> lista) {
        for(Funcionario f : lista) {
            System.out.println(f.toString());
        }
    }
    public static void printGastos(List<Funcionario> lista) {
        System.out.println("Total de gastos com Salario: " + cgs.calculaGastoSalarios(lista));
    }
}
