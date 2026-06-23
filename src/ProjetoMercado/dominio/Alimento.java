package ProjetoMercado.dominio;

public class Alimento extends Produto{
    private String dataValidade;

    public Alimento(int id, String nome, double preco, String dataValidade) {
        super(id, nome, preco);
        this.dataValidade = dataValidade;
    }
    //Modificar depois de modelar
    @Override
    public String getTipo() {
        return "Produto do tipo Alimento";
    }

    @Override
    public String getDescricao() {
        return "Descição do Produto: \n" +
                "Id: "+getId()+
                " | Nome: "+getNome()+
                " | Preco: "+ getPreco()+
                " | Data de Validade: "+this.dataValidade;
    }
}
