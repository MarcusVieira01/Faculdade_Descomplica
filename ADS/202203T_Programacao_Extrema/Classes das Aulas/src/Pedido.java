import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //Declaração de atributos
    private String identificador;
    private List<Item> itens;/*Declarado o tipo da List como sendo a classe Item GERANDO COMPOSIÇÃO, ou seja, A classe Pedido nunca existirá sem a classe Item*/

    //Declaração de construtor
    public Pedido(String identificador, List<Item> itens) {
        this.identificador = identificador;
        this.itens = new ArrayList<Item>();
    }

    //Declaração de métodos getter e setter
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public List<Item> getItem() {
        return itens;
    }
    //Substituindo o método addItem(Item item) da aula
    public void setItem(List<Item> item) {
        this.itens.add((Item) item);
    }

    //Declaração de método com sobrecarga, que retornará os valores dos atributos como string
    @Override
    public String toString(){
        //Declaração de variável local e atribuição de valor de inicialização
        String itens = "";

        //Loop for que em cada iteração atribuirá o valor do elemento do objeto ArrayList iten à variável itens. Declaração de for diferente PESQUISAR
        for(Item item : this.itens){
            itens += item.getNome();
        }
        //Retorno do valor da variável itens
        return itens;
    }
}
