public class Retangulo {

    private double largura;
    private double altura;

    // Construtor com validação
    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Largura e altura devem ser positivas.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {                                                     
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public boolean ehQuadrado() {
        return largura == altura;
    }
}