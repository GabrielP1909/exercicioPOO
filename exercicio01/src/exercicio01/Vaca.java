package exercicio01;

public class Vaca extends Animal {

    public Vaca(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Muuu!");
    }
}