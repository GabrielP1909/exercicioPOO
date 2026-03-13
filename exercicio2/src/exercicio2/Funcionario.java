
package exercicio2;

public class Funcionario { 
    

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        setSalario(salario); 
        this.cargo = cargo;
    }

   
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual < 0) {
            throw new IllegalArgumentException("O percentual não pode ser negativo.");
        }
        salario += salario * (percentual / 100);
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }
}
    

