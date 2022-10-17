public class Recurssividade {
    //Declaração de método recursivo que exibirá uma contagem regressiva
    public static void imprimirSequenciaDecrescente(Integer x){
        //Declaração de condicional de quebra de recurssividade, utilizando a keyword return como parada
        if(x == 0) return;
        //Exibição do valor da variável x
        System.out.println(x);
        //Evocação recurssiva do método, passando como parâmetro a expressão matemática
        imprimirSequenciaDecrescente(x - 1);
    }
    //Declaração de método principal main
    public static void main(String [] args){
        //Evocação do método passando o valor do parâmetro
        imprimirSequenciaDecrescente(10);
    }
}
