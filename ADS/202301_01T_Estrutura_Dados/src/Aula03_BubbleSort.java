//Declaração de classe
public class Aula03_BubbleSort {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variáveis
        int vetor[] = {9, 5, 1, 3, 10, 8, 4, 6, 7, 2};

        //Atribuição do valor de retorno do métoco bolha(args) na mesma variável que é dada de parâmetro
        vetor = bolha(vetor);

        //Loop for que iterará sobre o vetor e exibirá cada elemento concatenado
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
        }
        //Encerramento da execução com status 0
        System.exit(0);
    }

    //Declaração de método que realiza o bubble sort
    public static int[] bolha(int numeros[]){
        //Declaração de variáveis
        final int n = numeros.length;
        int aux;

        //Aninhamento de loop for que a cada iteração fará a comparação do valor dos elementos consecutivos e caso o segundo seja maior que o primeiro, fará a ordenação realizando a troca de posição
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(numeros[j] > numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }

        //Retorno do valor contido na variável numeros, sendo  array já ordenado
        return numeros;
    }
}
