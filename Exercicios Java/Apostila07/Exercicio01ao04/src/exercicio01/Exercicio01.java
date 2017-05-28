
package exercicio01;

public class Exercicio01 {


    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setNome("Marley");
        dog.setIdade("12");
        Veterinario vet = new Veterinario();
        vet.examinar(dog);
        Zoologico zoo = new Zoologico();
        zoo.insertAnimalinZoo(dog);
        zoo.percorreZoo();
    }
    
}
