package exercicio5;

public class Main {
    public static void main(String[] args) {

        retangulo r = new retangulo(4, 5);

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
        System.out.println("É quadrado? " + r.ehQuadrado());
    }
}
