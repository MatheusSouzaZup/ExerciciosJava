package exercicio09;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Exercicio09 {

    static Scanner ler = new Scanner(System.in);
    static List<Sala> salas = new ArrayList<Sala>();
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
            int op = 0;
        do {
            printmenuoptions(1);
            System.out.print("Escolha uma opcao: ");
            op = ler.nextInt();
            switch(op) {
                case 1:
                    cadastrarsala();
                    break;
                case 2:
                    printsalas();
                    break;
                case 3:
                    break;
            }
        }while(op!=0);
    }
    public static void cadastrarsala() {
        Sala sala = new Sala();
        int op = 0;
        System.out.print("Insira a identificação da Sala :");
        sala.setSala(ler.nextLine());
        sala.setSala(ler.nextLine());
        System.out.println("Insira ate no maximo 10 alunos!");
        do{
           printmenuoptions(2);
           op = ler.nextInt();
           switch(op) {
               case 1:
                   sala.inserevet(cadastraAluno());
                   break;
               case 2:
                   printalunos();
                   break;
               case 3:
                   break;
           }
            
        }while(op!=3);
        salas.add(sala);
    }
    public static void printmenuoptions(int type) {
        switch(type) {
            case 1:
                System.out.println("1- Cadastrar 1 Sala\n"+
                                   "2- Imprimir Salas Cadastradas\n"+
                                   "3- Voltar");
                           break;
            case 2:
                System.out.println("1- Cadastrar Aluno\n"+
                                   "2- Imprimir Alunos Cadastrados\n"+
                                   "3- Voltar");
                            break;
            default:
                break;
        }
    }

    private static void printsalas() {
        int cont =1;
        for(Sala s : salas){
            System.out.println(cont + "-" + s.getSala());
        }
    }

    private static Aluno cadastraAluno() {
        Aluno aluno;
           aluno = new Aluno();
           System.out.print("Nome Completo: ");
           aluno.setNome(ler.nextLine());
           aluno.setNome(ler.nextLine());
           System.out.print("Cpf : ");
           aluno.setCpf(ler.nextLine());
           System.out.print("Idade: ");
           aluno.setIdade(ler.nextLine()); 
           return aluno;
    }
    
    private static void printalunos() {
        int cont = 1;
        for(Sala s : salas) {
            for(Aluno a : s.getAlunos()) {
                System.out.println(cont + "- " + a.getNome() + a.getCpf());
            }
        }
    }


}
