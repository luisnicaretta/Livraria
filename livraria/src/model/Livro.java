package model;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    private Categoria categoria;

    public Livro(String titulo, String autor, double preco, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
        categoria.exibirCategoria();
    }

    public double getPreco() {
        return preco;
    }
}
