package formas;

public class Quadrado extends Retangulo {

    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Quadrado:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("----------------------");
    }
}