
package exercicio01;


public class Veterinario {
    
    public String examinar(Cachorro dog) {
       return dog.emitirSom();
    }
    public String examinar(Cavalo horse) {
        return horse.emitirSom();
    }
    public String examinar(Preguica pregui) {
        return pregui.emitirSom();
    }
}
