import java.util.LinkedList;

public class ExemploLinkedList {
    //Declaraçao de método principal
    public static void main(String[] args) {
        //Instanciação de objeto advindo da classe LinkedList<type> via construtor e sua referência atribuída à variável minhaLinkedList
        LinkedList<String> minhaLinkedList = new LinkedList<String>();
       
        //Insere o valor do argumento ao primeiro elemento da lista sem sobrescrever
        minhaLinkedList.addFirst("A");

        //Insere os valores dos argumernos aos elementos subsequentes
        minhaLinkedList.add("B");
        minhaLinkedList.add("C");
        minhaLinkedList.add("D");

        //Com o valor primiero argumento explicito, será indicado onde deve ser inserido o valor. No caso no elemento de índice 2 não sobrescrevendo
        minhaLinkedList.add(2, "X");

        //Insere o valor do argumento ao último elemento da lista, sem sobrescrever
        minhaLinkedList.addLast("Z");

        //Exibição dos elementos contidos na lista minhaLinkedList
        System.out.println(minhaLinkedList);

        //Remoção do primeiro elemento da lista
        minhaLinkedList.remove();

        //Remoção do último elemento da lista
        minhaLinkedList.removeLast();

        //Exibição dos elementos contidos na lista minhaLinkedList
        System.out.println(minhaLinkedList);

        //Remoção do elemento de valor "C"
        minhaLinkedList.remove("C");

        //Exibição dos elementos contidos na lista minhaLinkedList
        System.out.println(minhaLinkedList);

        //Exibição do valor do primeiro e último elementos
        System.out.println("Primeiro objeto: " + minhaLinkedList.getFirst());
        System.out.println("Ultimo objeto: " + minhaLinkedList.peekLast());//Também funciona com getLast()
    }
}
