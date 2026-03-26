package exercicio01;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Iiiirrr!");
    }
}