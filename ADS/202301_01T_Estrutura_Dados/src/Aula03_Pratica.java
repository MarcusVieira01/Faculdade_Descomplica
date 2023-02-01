import javax.swing.JOptionPane;

public class Aula03_Pratica {
    //Método principal
    public static void main(String[] args) {
        //Declaração de variáveis
        int vetor[] = {10, 50, 21, -9, 2, -69};
        String mensagem = "";

        //Evocação do método de ordenação bubble sort
        bubbleSort(vetor);

        //Loop for que fará a iteração do vetor e o acúmulo na variável mensagem
        for (int i = 0; i < vetor.length; i++) {
            mensagem = mensagem + vetor[i] + " ";
        }

        //Exibilção do conteúdo da variável mensagem
        JOptionPane.showMessageDialog(null, mensagem, "Ordenação dos vetores", 1);

        //Evocação de método de encerramento do programa com status 0
        System.exit(0);
    }

    //Método que fará a ordenação do vetor recebido como parâmetro, via bubblesort
    public static void bubbleSort(int vetor[]) {
        //Declaração de variáveis
        int aux = 0;
        //Loop for que fará a auxílio a iteração do vetor
        for (int i = 0; i < (vetor.length - 1); i++) {
            //Loop for que fará a iteração do vertor e sua devida ordenação
            for (int j = 0; j < (vetor.length - 1 - i); j++) {
                //Condicional que caso true fará a operação de troca de posições dos elementos e sua ordenação
                if(vetor[j] > vetor[j + 1]){
                    //Operação de troca de valores dos elementos
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }
}
