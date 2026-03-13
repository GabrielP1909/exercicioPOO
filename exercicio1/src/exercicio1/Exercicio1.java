
package exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        

        Aluno aluno1 = new Aluno("Juliane", 8.5, 7.0);

        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Média: " + aluno1.calcularMedia());

        if (aluno1.verificarAprovacao()) {
            System.out.println("Status: Aprovado ✅");
        } else {
            System.out.println("Status: Reprovado ❌");
        }
    }
}
        
        
        
    
    

