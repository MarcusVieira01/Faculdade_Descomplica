//Importação de classe externa
import javax.swing.JOptionPane;

//Declaração de classe
public class PR_1 {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variáveis
        int vetor[] = new int[50];
        int soma = 0;
        float media;

        //Loop for que fará a iteração por todo vetor onde em cada elemento será requisitado o valor para o usuário, será parseado o valor, atribuído ao elemento pertinente e será acumulado esse valor na variável soma
        for (int i = 0; i < vetor.length; i++) {
            //Atribuição do valor requisitaod ao usuário, após parsemaento, ao elemento pertinente do vetor
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor inteiro para a posição " + i));
            //Acúmulo do valor do elemento pertinente à variável soma
            soma += vetor[i];
        }

        //Atribuição do valor de resultado da expressão matemática
        media = soma / vetor.length;

        //Exibição do valor da variável media
        JOptionPane.showMessageDialog(null, "A média dos " + vetor.length + " elementos do vetor é " + media);
    }
}
