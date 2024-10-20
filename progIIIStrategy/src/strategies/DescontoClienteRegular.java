package strategies;

public class DescontoClienteRegular implements DescontoStrategy{
    @Override
    public double calcularDesconto(Double preco) {
        return preco - (preco/100 * 10);
    }
}
