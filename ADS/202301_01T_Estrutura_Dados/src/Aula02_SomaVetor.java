//Importação de classe externa
import javax.swing.JOptionPane;

/**
 * @apiNote Declaração de classe que fará a soma de 100 elementos de um vetor
 */
public class Aula02_SomaVetor {
    public static void main(String[] args) {
        //Declaração de variáveis
        int vetor[] = new int[100];
        int soma = 0;

        //Loop que fará a requisição de dados ao usuário, fará a atribuição do valor ao elemento específico e fará o acúmulo do elemento inserido na variáve soma
        for (int i = 0; i <= 99; i++) {
            //Atribuição do valor inseriro pelo usuário, após parse, ao elemento do vetor
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor inteiro para a posição " + i));
            //Acúmulo do valor do elemento à variável soma
            soma += vetor[i];
        }

        //Exibição do valor da variável soma
        JOptionPane.showMessageDialog(null, "O valor da soma dos 100 elementos é " + soma);
    }
}
