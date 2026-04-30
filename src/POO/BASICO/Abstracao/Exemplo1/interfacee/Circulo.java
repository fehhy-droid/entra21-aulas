package POO.BASICO.Abstracao.Exemplo1.interfacee;

public class Circulo implements  IFormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * Math.PI;
    }
}
