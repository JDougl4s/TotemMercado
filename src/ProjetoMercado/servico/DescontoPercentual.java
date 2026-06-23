package ProjetoMercado.servico;

import ProjetoMercado.interfaces.Desconto;

public class DescontoPercentual implements Desconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double aplicarDesconto(double valorOriginal) {
        return valorOriginal - (valorOriginal * percentual / 100);
    }
}
