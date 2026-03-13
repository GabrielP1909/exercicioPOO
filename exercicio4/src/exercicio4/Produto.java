
package exercicio4;

public class Produto { 

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public void entradaEstoque(int qtd) {
        if (qtd <= 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        quantidade += qtd;
    }

    public void saidaEstoque(int qtd) {
        if (qtd <= 0 || qtd > quantidade) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        quantidade -= qtd;
    }

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: " + valorTotalEstoque());
    }
}
    

