
package exercicio01;
import java.util.List;
import java.util.ArrayList;

public class Zoologico {
      List<Animal> lista = new ArrayList<>();
      
      public void insertAnimalinZoo(Cachorro dog) {
          lista.add(dog);
      }
      
      public void insertAnimalinZoo(Cavalo horse) {
          lista.add(horse);
      }
      
      public void insertAnimalinZoo(Preguica pregui) {
          lista.add(pregui);
      }
      public void percorreZoo() {
          for(Animal x : lista) {
              System.out.println(x.emitirSom());
              System.out.println(x.animalAction());
          }
      }
    
}
