package ProjetoMercado.dominio;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.stream.Collectors;

public class Ticket {
    private String numeroPedido;
    private LocalDateTime dataEmissao;
    private double valorTotal;
    private String codigoBarras;

    public Ticket(Pedido pedido){
        this.numeroPedido = pedido.getNumeroPedido();
        this.dataEmissao = LocalDateTime.now();
        this.valorTotal = pedido.calcularTotal();
        Random random = new Random();
        this.codigoBarras = random.ints(13, 0, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

    }

    public void imprimir(){
        System.out.println("===== TICKET =====");
        System.out.println("Pedido: " + numeroPedido);
        System.out.println("Data de emissão: " + dataEmissao);
        System.out.printf("Valor total: R$ %.2f%n", valorTotal);
        System.out.println("Código de barras: " + codigoBarras);
        System.out.println("==================");
    }
}
