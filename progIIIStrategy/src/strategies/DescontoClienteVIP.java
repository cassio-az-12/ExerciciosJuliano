package strategies;

public class DescontoClienteVIP implements DescontoStrategy{

    @Override
    public double calcularDesconto(Double preco) {
        return preco - (preco/ 100 * 20);
    }
}
