import java.util.HashSet;

public class ExemploHashSet {
    //Declaração de método principal
    public static void main(String[] args) {
        //Instanciação de novo objeto advindo da classe HashSet, de tipo String e via construtor
        HashSet<String> hs = new HashSet<String>();

        //Inserção de elementos via método add(arg)
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");//No caso como cada valor do elemento deve ser único, o primeiro elemento M foi removido e mantido este
        hs.add("X");

        //Exibição dos valores de retorno dos métodos, de forma concatenada
        System.out.println("Tamanho do HashSet: " + hs.size());
        System.out.println("HashSet Original: " + hs);
        System.out.println("Removendo o elemeto A do HashSet: " + hs.remove("A"));
        System.out.println("Removendo o elemento Z do HashSet, porem e inexistente: " + hs.remove("Z"));
        System.out.println("Verificando se M esta presente: " + hs.contains("M"));
        System.out.println("Verificando se Z esta presente: " + hs.contains("Z"));
        System.out.println("HashSet Atualizado: " + hs);
    }
}
