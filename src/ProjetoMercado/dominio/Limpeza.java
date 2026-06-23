package ProjetoMercado.dominio;

public class Limpeza extends Produto{
    private String tipoUso;

    public Limpeza(int id, String nome, double preco, String tipoUso) {
        super(id, nome, preco);
        this.tipoUso = tipoUso;
    }
    //Modificar depois de modelar
    @Override
    public String getTipo() {
        return "Produto do tipo Limpeza";
    }

    @Override
    public String getDescricao() {
        return "Descição do Produto: \n" +
                "Id: "+getId()+
                " | Nome: "+getNome()+
                " | Preco: "+ getPreco()+
                " | Tipo de uso: "+this.tipoUso;
    }
}
