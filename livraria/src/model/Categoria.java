package model;

public class Categoria {
    private String nome;
    private String descricao;

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void exibirCategoria() {
        System.out.println("Categoria: " + nome + " - " + descricao);
    }
}
