//Programa com declaração de variáveis, que recebe informações pela linha de comando, calcula a adição de dois números e mostra informações pela linha de comando
//Classe principal que fará o escopo supracitado
class Dados_java{
    public static void main (String entrada[]){
        //Declaração de variáveis
        int numeroInt;
        double numeroReal, soma;
        char caractere;
        //Atribuição de valores de input convertidos via métodos específicos
        numeroInt = Integer.parseInt(entrada[0]);
        numeroReal = Double.parseDouble(entrada[1]);
        caractere = (entrada[2]. charAt(0));
        //Atribuição do valor de resultado da expressão matemática à variável soma
        soma = (double)numeroInt + numeroReal;
        //Método de exibição formatada dos valores das variáveis numeroInt, numeroReal, soma, caractere
        System.out.println((double)numeroInt + " + " + numeroReal + " = " + soma + " sinal " + caractere);
        //Método de encerramento do programa
        System.exit(0);
    }
}
