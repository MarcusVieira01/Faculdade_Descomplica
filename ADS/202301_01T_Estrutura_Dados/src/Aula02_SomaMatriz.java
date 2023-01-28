//Importação de classe externa 
import javax.swing.JOptionPane;

/**
 * @apiNote Classe que fará a soma dos 120 elementos de uma matriz 10x12
 */
public class Aula02_SomaMatriz {
    public static void main(String[] args) {
        //Declaração de variáveis
        int matriz[][] = new int[10][12];
        int soma = 0;

        //Loop for encadeado que fará a atribuição de cada valor digitado pelo usuário ao elemento da matriz pertinente e o acúmulo
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 11; coluna++) {
                //Atribuição do valor inserido pelo usuário ao elemento pertinente da matriz
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Insira um número inteiro para a posição " + 
                                                       "[" + linha + "][" + coluna + "]"));
                //Acúmulo do valor do elemento da matriz na variável soma
                soma += matriz[linha][coluna];
            }
        }
        //Exibição do valor da variável soma
        JOptionPane.showMessageDialog(null, "A soma dos 120 elementos é " + soma);
    }
}
