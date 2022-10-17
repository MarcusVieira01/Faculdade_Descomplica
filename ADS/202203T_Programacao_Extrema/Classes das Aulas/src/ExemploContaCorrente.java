import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ExemploContaCorrente {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciação de 3 objetos advindos da classe Conta, evocando o construtor e incluindo os valores dos atributos. Atribuição de suas referências às variáveis conta1, conta2 e conta3
        Conta conta1 = new Conta("Marcus", 20500.00);
        Conta conta2 = new Conta("Sandra", 6985.00);
        Conta conta3 = new Conta("Vanessa", 54236.00);

        //Instanciação de novo objeto List contendo elementos do tipo Conta e atribuição de sua referência à variável contas
        List<Conta> contas = new ArrayList<Conta>();

        //Inserção das referências dos objetos contidos nas variáveis conta1, conta2 e conta3 ao objeto List contas, sendo estes objetos os elementos da lista
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        //APLICAÇÃO DA ENTIDADE COMPARATOR
        //Evocação do método sort, do objeto da referência contida na variável contas. No argumento temos a instancição de novo objeto anônimo advindo da classe Comparator, com seu método compare sobrecarregado com a lógica desejada, no caso ordem crescente.
        contas.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta o1, Conta o2){
                if(o1.getSaldo() > o2.getSaldo()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        //APLICAÇÂO DA ENTIDADE ITERATOR
        //Como o objeto contas é construido via o construtor da Classe ArrayList<type> e ela herda as características da superclasse List, o método interator é herdado junto. Declaramos a variável interator que vem do tipo Interator e armazena o retorno do método contas.interator();
        Iterator<Conta> iterator = contas.iterator();

        //Loop while que enquanto o retorno do método .hasNext() do objeto iterator for true, que ocorrerá enquanto houver um próximo item à ser iterado, atribuirá o valor do elemento iterado à variável conta, do tipo Conta e será exibido seu conteúdo. Essa exibição ocorre via método toString() sobreescrito
        while(iterator.hasNext()){
            Conta conta = iterator.next();
            System.out.println(conta);
        }
    }
}
