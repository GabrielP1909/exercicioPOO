
package exercicio3;
public class Exercicio3 {
    public static void main(String[] args) { 
        
          ContaCorrente conta = new ContaCorrente(1234, "Juliane");

        conta.consultarSaldo();

        conta.depositar(500);
        conta.consultarSaldo();

        conta.sacar(200);
        conta.consultarSaldo();

        conta.sacar(400); 
    }
}
        
    
    

