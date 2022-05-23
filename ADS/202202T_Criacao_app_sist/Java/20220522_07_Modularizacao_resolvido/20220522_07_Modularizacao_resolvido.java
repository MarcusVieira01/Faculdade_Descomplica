//Programa que declare vetor int de 5 posições, receba os valores dos elementos deste vetor, calcula a somatória e a produtória com um procedimento e uma função, ambos sem parâmetros e exibe as informações

//Importação de biblioteca externa
import javax.swing.*;
//Declaração da classe principal
class Modularizacao_resolvido{
    //Declaração de método secundário como procedimento
    public static void somatoria(){
        //Declaração de variáveis e atribuição dos seus valores de inicialização
        int sum = 0, vetorSoma [] = {1, 2, 3, 4, 5};
        //Loop for que varrerá o vetor vetorSoma e executará o bloco de código
        for(int ctrl = 0; ctrl < vetorSoma.length; ctrl++){
            //Atribuição do valor de resultado da expressão matemática ao valor da variável sum
            sum = sum + vetorSoma[ctrl];
        }
        //Exibição do valor da variável sum, concatenando com a mensagem pertinente via método da biblioteca swing
        JOptionPane.showMessageDialog(null, "A somatória é: " + sum);
    }

    //Declaração de método secundário como função
    public static int produtoria(){
        //Declarção de variável
        int prod = 1, vetorProd[] = {1, 2, 3, 4, 5};
        //Loop for que varrerá o vetor vetorProd
        for(int controle = 0; controle < vetorProd.length; controle++){
            //Atribuição do valor de resultado da expressão matemática ao valor da variável prod
            prod = prod * vetorProd[controle];
        }
        //Uso da keyword return para que o valor da variável prod seja retornado pela função
        return prod;
    }

    //Declaração do método principal
    public static void main(String entrada[]){
        //Declaração de variáveis e atribuição do valor de retorno da função produtoria()
        int produt = produtoria();
        //Evocação da dunção somatória() e exibição do valor da variável produt
        somatoria();
        JOptionPane.showMessageDialog(null, "A produtória é " + produt);
        //Uso de método para encerrar o programa
        System.exit(0);
    }
}
