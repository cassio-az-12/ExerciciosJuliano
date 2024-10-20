import entidades.Produto;
import servicos.Carrinho;
import strategies.DescontoClienteNovo;
import strategies.DescontoClienteRegular;
import strategies.DescontoClienteVIP;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("pao", 100.00);
        Produto produto2 = new Produto("chocolate", 100.00);
        Produto produto3 = new Produto("refrigerante", 100.00);

        Carrinho carrinho = new Carrinho();
        carrinho.addProduto(produto1);
        carrinho.addProduto(produto2);
        carrinho.addProduto(produto3);

        try {
            carrinho.definirDesconto(new DescontoClienteNovo());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Valor total do Cliente Novo: $ " + carrinho.getTotalProdutos());

        try {
            carrinho.definirDesconto(new DescontoClienteRegular());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Valor total do Cliente Regular: $ " + carrinho.getTotalProdutos());

        try {
            carrinho.definirDesconto(new DescontoClienteVIP());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Valor total do Cliente VIP: $ " + carrinho.getTotalProdutos());

    }
}