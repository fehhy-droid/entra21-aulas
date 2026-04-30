package POO.BASICO.Abstracao.Exemplo1.interfacee;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Retangulo retangulo = new Retangulo(3, 4);

        System.out.println("A area do circulo é " + circulo.calcularArea());
        System.out.println("A area do retangulo é " + retangulo.calcularArea());

        IFormaGeometrica interfaceFormaGeometrica = new Circulo(2);
        interfaceFormaGeometrica.calcularArea();
    }
}
