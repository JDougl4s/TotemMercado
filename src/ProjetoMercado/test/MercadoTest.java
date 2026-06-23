package ProjetoMercado.test;

import ProjetoMercado.dominio.CatalagoProdutos;
import ProjetoMercado.dominio.Pedido;
import ProjetoMercado.dominio.Produto;
import ProjetoMercado.dominio.Ticket;
import ProjetoMercado.servico.DescontoFixo;
import ProjetoMercado.servico.DescontoPercentual;

import java.util.Scanner;

public class MercadoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatalagoProdutos catalogo = new CatalagoProdutos();
        int opcaoPrincipal;
        int contadorPedido = 1;
        do {
            System.out.println("\n===== TOTEM MERCADO =====");
            System.out.println("1 - Criar novo pedido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcaoPrincipal = scanner.nextInt();
            switch (opcaoPrincipal) {
                case 1: {
                    String numeroPedido = String.format("PED-%03d", contadorPedido);
                    contadorPedido++;
                    Pedido pedido = new Pedido(numeroPedido);
                    System.out.println("\nPedido criado: " + pedido.getNumeroPedido());
                    int opcaoPedido;
                    do {
                        System.out.println("\n===== PEDIDO " + pedido.getNumeroPedido() + " =====");
                        System.out.println("1 - Listar produtos");
                        System.out.println("2 - Adicionar produto");
                        System.out.println("3 - Mostrar total");
                        System.out.println("4 - Aplicar desconto fixo");
                        System.out.println("5 - Aplicar desconto percentual");
                        System.out.println("6 - Finalizar pedido");
                        System.out.println("7 - Mostrar status");
                        System.out.println("8 - Gerar ticket");
                        System.out.println("9 - Voltar ao menu principal");
                        System.out.print("Escolha uma opção: ");
                        opcaoPedido = scanner.nextInt();
                        switch (opcaoPedido) {
                            case 1:
                                catalogo.listarTodosProdutos();
                                break;
                            case 2: {
                                System.out.print("Digite o ID do produto: ");
                                int id = scanner.nextInt();
                                Produto produto = catalogo.buscarPorId(id);
                                if (produto != null) {
                                    System.out.print("Digite a quantidade: ");
                                    int quantidade = scanner.nextInt();
                                    if (quantidade > 0) {
                                        pedido.adicionarItem(produto, quantidade);
                                        System.out.println("Produto adicionado ao pedido.");
                                    } else {
                                        System.out.println("A quantidade deve ser maior que zero.");
                                    }
                                } else {
                                    System.out.println("Produto não encontrado.");
                                }
                                break;
                            }
                            case 3:
                                System.out.printf("Total do pedido: R$ %.2f%n", pedido.calcularTotal());
                                break;
                            case 4: {
                                System.out.print("Digite o valor do desconto: R$ ");
                                double valorDesconto = scanner.nextDouble();
                                pedido.definirDesconto(new DescontoFixo(valorDesconto));
                                System.out.println("Desconto fixo definido.");
                                break;
                            }
                            case 5: {
                                System.out.print("Digite o percentual do desconto: ");
                                double percentual = scanner.nextDouble();
                                pedido.definirDesconto(new DescontoPercentual(percentual));
                                System.out.println("Desconto percentual definido.");
                                break;
                            }
                            case 6:
                                pedido.finalizarPedido();
                                System.out.println("Status atual: " + pedido.getStatus());
                                break;
                            case 7:
                                System.out.println("Status atual: " + pedido.getStatus());
                                break;
                            case 8: {
                                Ticket ticket = pedido.gerarTicket();
                                ticket.imprimir();
                                break;
                            }
                            case 9:
                                System.out.println("Voltando ao menu principal.");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } while (opcaoPedido != 9);
                    break;
                }
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoPrincipal != 0);
        scanner.close();
    }
}
