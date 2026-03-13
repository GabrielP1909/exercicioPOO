
package exercicio6;

public class Exercicio6 {
    
    public static void main(String[] args) { 
        
        Pessoa p1 = new Pessoa("Juliane", 16);
        Pessoa p2 = new Pessoa("Ana", 20);
        Pessoa p3 = new Pessoa("Carlos", 30);

        p1.setNome("Julia");
        p2.setIdade(21);
        p3.setNome("Carlos Silva");

        p1.fazerAniversario();
        p2.fazerAniversario();

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}
    

