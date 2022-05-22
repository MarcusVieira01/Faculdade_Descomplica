//Programa que declara variáveis vetor de 5 posições e uma matriz 2x3 inteiras, coloca ou recebe informações nas matrizes e exibe as informações

//Importação de biblioteca externa
import javax.swing.*;
//Declaração da classe principal
class Matrizes_vetores01{
    //Declaração do método principal
    public static void main(String entrada []){
        //Declaração de variável como um vetor (matriz unidimensional) que possui valores literais, ou seja, já inicializados
        int vetor[] = {2, 4, 6, 8, 10};
        //Declaração de variável do tipo matriz, onde é realizado instanciamento como objeto via keyword new, definido seu tipo e a quantidade de linhas e colunas
        int matriz[][] = new int[2][3];
        //Declaração de variáveis e atribuição dos valores de inicialização
        String vetMsg = "vetor => ";
        String mtxMsg = "matriz => ";
        String mtxInpMsg = "Digite um valor inteiro para a posição da matriz ";

        //Loop for que varrerá a variável vetor, concatenará cada valor do elemento de índice dado pelo valor da variável ctrl e atribuirá à variável vetMsg
        for(int ctrl = 0; ctrl < vetor.length; ctrl++){
            vetMsg = vetMsg + vetor[ctrl] + " ";
        }
        //Loop for que varrerá as posições de linha da variável matriz
        for(int i = 0; i < matriz.length; i++){
            //Loop for que varrerá as posições de coluna da variável matriz
            for(int j = 0; j < matriz[0].length; j++){
                //Atribuição do valor de input do usuário, via método da biblioteca swing e conversão para int.
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(mtxInpMsg + i + " e " + j));
                //Concatenação do valor do elemento de índices dados pelos valores das variáveis i e j, com atribuição à variável mtxMsg
                mtxMsg = mtxMsg + matriz[i][j] + " ";
            }
        }
        //Exibição concatenada dos valores das variáveis vetMsg e mtxMsg
        JOptionPane.showMessageDialog(null, vetMsg + "\n" +  mtxMsg);
        //Uso de método para encerramento do programa
        System.exit(0);
    }
}