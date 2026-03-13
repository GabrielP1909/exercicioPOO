
package exercicio4;

public class Exercicio4 {

    public static void main(String[] args) { 
        
        Produto produto = new Produto("Notebook", 3500);

        produto.entradaEstoque(10);
        produto.exibirDados();

        produto.saidaEstoque(3);
        produto.exibirDados();
    }
}
        
        
        
    
    

