package servicos;

import entidades.Produto;
import strategies.DescontoClienteNovo;
import strategies.DescontoStrategy;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> lista = new ArrayList<>();
    private double precoDesconto;

    DescontoStrategy descontoStrategy = new DescontoClienteNovo();
    public void addProduto(Produto produto){
        this.lista.add(produto);
        precoDesconto = produto.getPreco();
    }

    public void definirDesconto(DescontoStrategy descontoCliente) throws Exception {
        descontoStrategy = descontoCliente;
    }
    public Double getTotalProdutos() {
        final Double[] total = {0.0};

        this.lista
                .stream()
                .forEach(x -> total[0] += descontoStrategy.calcularDesconto(precoDesconto) );

        return total[0];
    }



}
