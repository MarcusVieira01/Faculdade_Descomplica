public class Aula04_MergeSort {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de vetor com os valores de iniciaçização
        int vetor[] = {0, 8, -4, 16, -12, 17, 13, -9, 2, 11};
        //Evocação do métood que fará a ordenação recursiva
        mergeSort(vetor, 0, 9);
        //loop for que varrerá o vetor e exibirá cada elemento
        for(int i = 0; i < 10; i++){
            System.out.println(vetor[i] + " ");
        }
        //Evocação de método para encerramento do programa com status 0
        System.exit(0);
    }

    //Método que fará a recursão da quebra dos arrays
    public static void mergeSort(int [] a, int inicio, int fim){
        //Condicional que impleenta o conceito failfast, onde se o início for igual ao fim, não realiza o bloco de recursão
        if(inicio == fim){
            return;
        }
        //Declaração de variável e atribuição de valor de inicialização
        int meio = (inicio + fim) / 2;
        //Bloco de recursão que fará a chamada deste método até o tamanho dos vetores forem iguais ao início e fim
        mergeSort(a, inicio, meio);
        mergeSort(a, meio + 1, fim);
        //Chamada de método que fará a uni~]ao ordenada de todos os subvetores
        merge(a, inicio, meio, fim);

    }

    //Declaração de método que fará as ordenações e atribuição ordenada no array 
    private static void merge(int[] a, int inicio, int meio, int fim) {
        //Declaração de variáveis e atribuição dos valores de inicialização
        int n = fim - inicio + 1;
        int[] b = new int[n];
        int i1 = inicio;
        int i2 = meio + 1;
        int j = 0;
        //Loop while que ordenam as listas separadas, realizando o merge
        while(i1 <= meio && i2 <= fim){
            if(a[i1] < a[i2]){
                b[j] = a[i1];
                i1++;
            }else{
                b[j] = a[i2];
                i2++;
            }
            j += 1;
        }
        while(i1 <= meio){
            b[j] = a[i1];
            i1 += 1;
            j += 1;
        }
        while(i2 <= fim){
            b[j]= a[i2];
            i2 += 1;
            j += 1;
        }

        //Loop for que iterará os vetores a e b realizando a atribuição ordenada
        for (j = 0; j < n; j++){
            a[inicio + j] = b[j];
        }
    }
}
