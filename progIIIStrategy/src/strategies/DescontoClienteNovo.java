package strategies;

public class DescontoClienteNovo implements DescontoStrategy {
    @Override
    public double calcularDesconto(Double preco) {
        return preco;
    }
}
