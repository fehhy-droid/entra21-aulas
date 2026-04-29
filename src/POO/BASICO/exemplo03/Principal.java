package POO.BASICO.exemplo03;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Boquinha de brinquedo");
        produto.setPreco(100d);

        produto.exibirInformacoes();

        System.out.println("============");

        Livro livro = new Livro();
        livro.setNome("E não sobrou ninguém");
        livro.setPreco(59_90d);
        livro.setAutor("Agatha Christie");

        livro.exibirInformacoes();
    }
}
