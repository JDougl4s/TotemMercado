
package ProjetoMercado.dominio;

import ProjetoMercado.interfaces.Desconto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String numeroPedido;
    private LocalDateTime dataHora;
    private StatusPedido status;
    private List<ItemPedido> itens;
    private Desconto estrategiaDesconto;

    public Pedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHora = LocalDateTime.now();
        this.status = StatusPedido.CRIANDO;
        this.itens = new ArrayList<>();
        this.estrategiaDesconto = null;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido itemPedido = new ItemPedido(produto, quantidade);
        this.itens.add(itemPedido);
    }

    public void removerItem(int indice) {
        if (indice >= 0 && indice < itens.size()) {
            this.itens.remove(indice);
        } else {
            System.out.println("item nao existe");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubTotal();
        }
        if (estrategiaDesconto != null) {
            total = estrategiaDesconto.aplicarDesconto(total);
        }
        return total;
    }

    public void definirDesconto(Desconto desconto) {
        this.estrategiaDesconto = desconto;
    }

    public void finalizarPedido() {
        if (!itens.isEmpty()) {
            this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
        } else {
            System.out.println("Não existe item no pedido");
        }
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public StatusPedido getStatus() {
        return this.status;
    }

    public Ticket gerarTicket() {
        return new Ticket(this);
    }
}