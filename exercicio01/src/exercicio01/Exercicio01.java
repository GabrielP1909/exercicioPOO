
package exercicio01;
public class Exercicio01 {
    public static void main(String[] args) { 
        
       Aluno aluno = new Aluno();

        aluno.setIdade(16);
       System.out.println("Idade: " + aluno.getIdade());

        aluno.setMatricula("62");
        System.out.println("Matrícula: " + aluno.getMatricula());

        aluno.setCurso("Informática");
        System.out.println("Curso: " + aluno.getCurso());
    }
}
    
    

