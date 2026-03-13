
package exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {

        try {
            Funcionario funcionario1 = new Funcionario("Juliane", 2500.00, "Desenvolvedora");

            funcionario1.exibirDados();

            System.out.println("\nAumentando salário em 10%...\n");
            funcionario1.aumentarSalario(10);

            funcionario1.exibirDados();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}