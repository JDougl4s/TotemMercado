package ProjetoMercado.dominio;

public class Bebida extends Produto{
    private double volume;
    private boolean alcoolica;

    public Bebida(int id, String nome, double preco, double volume, boolean alcoolica) {
        super(id, nome, preco);
        this.volume = volume;
        this.alcoolica = alcoolica;
    }
    //Modificar depois de modelar
    @Override
    public String getTipo() {
        return "Produto do tipo Bebida";
    }

    @Override
    public String getDescricao() {
        return "Descição do Produto: \n" +
                "Id: "+getId()+
                " | Nome: "+getNome()+
                " | Preco "+ getPreco()+
                " | Volume: "+this.volume+" L "+
                " | Alcoolica: " +(this.alcoolica == true ? "Sim":"Não");
    }
}
