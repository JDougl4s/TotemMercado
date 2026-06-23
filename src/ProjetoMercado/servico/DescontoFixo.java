package ProjetoMercado.servico;

import ProjetoMercado.interfaces.Desconto;

public class DescontoFixo implements Desconto {
    private double valorDesconto;

    public DescontoFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal - valorDesconto;
    }
}
