//Programa que declara variáveis vetor inteiro, recebe números inteiros no vetor de 5 posições, calcula a somatória e a produtória via um procedimento e uma função que recebe parâmetros e exibe as informações

//Importação de biblioteca externa
import javax.swing.*;

//Declaração da classe principal
class Modularizacao_resolvido_02{
    //Declaração de método secundário na forma de procedimento
    public static void somatoria(int vector[]){
        //Declaração de variável local
        int somat = 0;
        //Loop for que varrará a variável vetor vector
        for(int controle = 0; controle < vector.length; controle++){
            //Atribuição do valor de resultado da expressão matemática à variável somat
            somat = somat + vector[controle];
        }
        //Exibição concatenada do valor da variável somat via método da biblioteca swing
        JOptionPane.showMessageDialog(null, "A somatória é " + somat);
    }
    
    //Declaração de método secundário na forma de função
    public static int produtoria(int vextor[]){
    //Declaração de variável local
    int produt = 1;
    //Loop for que varrará a variável vetor vextor
    for(int ctr = 0; ctr < vextor.length; ctr++){
        //Atribuição do valor de resultado da expressão matemática à variável produt
        produt = produt * vextor[ctr];
        }
    //Uso da keyword return para retornar o valor da variável produt
    return produt;
    }

    //Declaração do método principal
    public static void main(String entrada[]){
        //Declaração de variável do tipo vetor, com instancianemento dessa variável com quantidade de posições definidas.
        int vetor[] = new int[5];
        //Loop for que varrará a variável vetor
        for(int ctrl = 0; ctrl < vetor.length; ctrl++){
            //Atribuição do valor de input pelo usuário, após conversão, ao elemento do array definido pelo índice dado pelo valor da variável ctrl
            vetor[ctrl] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro para a posição " + ctrl + " do vetor"));
        }
        //Evocação da função somatoria(arg) com parâmetro sendo a variável vetor
        somatoria(vetor);
        //Método da biblioteca swing que faráa exibição concatenada do valor de retorno do método função produtória(arg)
        JOptionPane.showMessageDialog(null, "A produtória é " + produtoria(vetor));
        //Método que encerrará o programa
        System.exit(0);
    }
}
