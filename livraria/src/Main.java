import model.Categoria;
import model.Cliente;
import model.Livro;
import model.Pedido;

public class Main {
    public static void main(String[] args) {
        // Criando categorias
        Categoria ficcao = new Categoria("Ficção", "Livros de histórias fictícias.");
        Categoria biografia = new Categoria("Biografia", "Histórias de vida de pessoas reais.");

        // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 39.90, ficcao);
        Livro livro2 = new Livro("Steve Jobs", "Walter Isaacson", 49.90, biografia);

        // Criando cliente
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", "Rua das Flores, 123");

        // Criando pedido
        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarLivro(livro1);
        pedido.adicionarLivro(livro2);

        // Exibindo informações do pedido
        pedido.exibirPedido();
    }
}
