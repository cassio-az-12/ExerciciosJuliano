package entidades;

public class Produto {

    private String nome = "";
    private Double preco = 0.0;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }
}
