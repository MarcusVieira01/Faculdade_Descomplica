//Declarção de classe
public class Aula03_QuickSort {
    //Declaração de método principal onde p é a primeira posição e q a última posição do vetor
    public static void main(String[] args) {
        //Declaração de variáveis
        int vetor[] = {12, 5, -3, 4, 0, 21, 8, -7, 9, 6};
        //Evocação de método quickSort(args)
        quickSort(0, 9, vetor);
        //Loop for que exibirá cada elemento do vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        //Chamada de método da classe System para encerramento do programa com status 0
        System.exit(0);
    }

    //Declaração de método de execução do Quick Sort 
    public static void quickSort(int p, int q, int vetor[]){
        //Declaração de variáveis
        int x;
        //Condicional que se true, fará a recursão para ordenação
        if(p < q){
            x = particao(p, q, vetor);
            quickSort(p, x - 1, vetor);
            quickSort(x + 1, q, vetor);
        }
    }

    //Declaração do método que fará a partição
    public static int particao(int p, int q, int vetor[]){
        //Declaração de variáveis
        int j = p - 1;
        int temp;
        int aux = vetor[q];
        //Loop for que fará a ordenação iterando o vetor
        for (int i = p; i <= q; i++) {
            if(vetor[i] <= aux){
                j++;
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        //Retorno do valor da variável j
        return j;
    }
}
