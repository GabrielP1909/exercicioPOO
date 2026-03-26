package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {

        Animal a1 = new Cachorro("Rex", 3, 20.5);
        Animal a2 = new Gato("Mimi", 2, 5.0);
        Animal a3 = new Vaca("Mimosa", 5, 350.0);
        Animal a4 = new Cavalo("Pé de Pano", 4, 400.0);

        // Polimorfismo
        Animal[] animais = {a1, a2, a3, a4};

        for (Animal animal : animais) {
            animal.emitirSom();
            
            
        }
    }
}