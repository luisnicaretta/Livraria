package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroId;
    private Cliente cliente;
    private List<Livro> livros;

    public Pedido(int numeroId, Cliente cliente) {
        this.numeroId = numeroId;
        this.cliente = cliente;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Livro livro : livros) {
            total += livro.getPreco();
        }
        return total;
    }

    public void exibirPedido() {
        System.out.println("Pedido Número: " + numeroId);
        cliente.exibirInformacoes();
        System.out.println("Livros Comprados:");
        for (Livro livro : livros) {
            livro.exibirInformacoes();
            System.out.println("-----");
        }
        System.out.println("Valor Total: R$ " + calcularValorTotal());
    }
}
