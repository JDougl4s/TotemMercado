package ProjetoMercado.dominio;

import java.util.ArrayList;
import java.util.List;

public class CatalagoProdutos {
    private List<Produto> produtosDisponiveis;

    public CatalagoProdutos(){
        produtosDisponiveis = new ArrayList<>();
        carregarMock();
    }

    private void carregarMock(){
        produtosDisponiveis.add(new Alimento(1, "Carne", 20.00, "24/06/2026"));
        produtosDisponiveis.add(new Limpeza(2, "Detergente", 4.00, "Cozinha"));
        produtosDisponiveis.add(new Bebida(3, "Vinho", 7.00, 1.0, true));

        produtosDisponiveis.add(new Alimento(4, "Arroz", 8.50, "15/12/2026"));
        produtosDisponiveis.add(new Alimento(5, "Feijão", 9.00, "20/11/2026"));
        produtosDisponiveis.add(new Alimento(6, "Macarrão", 5.50, "10/10/2026"));
        produtosDisponiveis.add(new Alimento(7, "Queijo", 18.00, "30/06/2026"));

        produtosDisponiveis.add(new Bebida(8, "Refrigerante", 9.50, 2.0, false));
        produtosDisponiveis.add(new Bebida(9, "Água Mineral", 3.00, 0.5, false));
        produtosDisponiveis.add(new Bebida(10, "Cerveja", 6.50, 0.35, true));
        produtosDisponiveis.add(new Bebida(11, "Suco de Laranja", 7.00, 1.0, false));

        produtosDisponiveis.add(new Limpeza(12, "Desinfetante", 8.00, "Pisos"));
        produtosDisponiveis.add(new Limpeza(13, "Sabão em Pó", 15.00, "Roupas"));
        produtosDisponiveis.add(new Limpeza(14, "Esponja", 3.50, "Cozinha"));
        produtosDisponiveis.add(new Limpeza(15, "Limpa Vidros", 10.00, "Vidros"));
    }

    public List<Produto> obterTodosProdutos(){
        return produtosDisponiveis;
    }

    public void listarTodosProdutos(){
        for (Produto produto : produtosDisponiveis){
            System.out.println(produto.getTipo());
            System.out.println(produto.getDescricao());
            System.out.println();
        }
    }

    public Produto buscarPorId(int id){
        for (Produto produto : produtosDisponiveis) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
}
