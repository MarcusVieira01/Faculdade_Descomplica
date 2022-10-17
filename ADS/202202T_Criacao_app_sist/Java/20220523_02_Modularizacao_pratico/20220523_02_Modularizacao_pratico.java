//Programa Java que declara matriz unidimensional (Vetor) de inteiros, receba números inteiros num vetor de 5 posições, calcula a somatória (ex.: s = s + vet[i]) e a produtória (ex.: p = p * vet[i]) desses números com um método similar a um procedimento e um método similar a uma função, ambos utilizando parâmetros, por fim, mostre essas informações na tela

//Importação de biblioteca externa
import javax.swing.*;

//Declaração da classe principal
class Modularizacao_pratico{
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
        //Declaração de variável tipo vetor e atribuição dos valores de inicialização
        int vetor[] = {1, 3, 5, 7, 9};
        //Evocação da função somatoria(arg) com parâmetro sendo a variável vetor
        somatoria(vetor);
        //Método da biblioteca swing que faráa exibição concatenada do valor de retorno do método função produtória(arg)
        JOptionPane.showMessageDialog(null, "A produtória é " + produtoria(vetor));
        //Método que encerrará o programa
        System.exit(0);
    }
}
