package PolimorfismoExercicio1.exercicio2;

    public class Principal {
        public static void main(String[] args) {
            Veiculo veiculoGenerico = new Veiculo();
            Veiculo Hillux = new Carro();
            Veiculo caloi = new Bicicleta();

            veiculoGenerico.veiculoMover();
            Hillux.veiculoMover();
            caloi.veiculoMover();
        }
}
