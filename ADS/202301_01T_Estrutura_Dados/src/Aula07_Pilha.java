//Declaração de classe principal
public class Aula07_Pilha {
    private int tamanho;
    private int topo;
    private int vetor [];
    
    //Declaração de construtor
    public Aula07_Pilha(int tamanho){
        this.tamanho = tamanho;
        this.topo = -1;
        this.vetor = new int[tamanho];
    }
    
    //Método getter
    public int getTamanho() {
        return tamanho;
    }
        
    //Método que fará o retorno de um booleano conforme a população da pilha
    private boolean pilhaVazia(){
        if(this.topo != -1){
            return false;
        }else{
            return true;
        }
    }

    //Método que fará o retorno de um booleano conforme a população da pilha
    private boolean pilhaCheia(){
        if(this.topo != this.vetor.length){
            return false;
        }else{
            return true;
        }
    }

    //Método que empilha um elemento passado no parâmetro
    public void empilhar(int elemento){
        if(pilhaCheia()){
            throw new StackOverflowError("Pilha cheia!");
        }else{
            topo++;
            this.vetor[this.topo] = elemento;
        }
    }

    //Método que retorna o elemento desempilhado deixando-o inacessível
    public int desempilhar(){
        int desempilhado = 0;

        if(pilhaVazia()){
            throw new NullPointerException("Pilha vazia!");
        }else{
            desempilhado = this.vetor[this.topo];
            this.topo--;

            return desempilhado;
       }
    }

    //Método que retorna um inteiro sendo o elemento do topo da pilha
    public int mostraElementoTopo(){
        if(pilhaVazia()){
            throw new NullPointerException("Pilha vazia!");
        }else{
            return this.vetor[this.topo];
        }
    }

    //Método que exibe cada elemento do vetor de forma concatenada
    public void mostrarPilha(){
        if(pilhaVazia()){
            throw new NullPointerException("Pilha vazia!");
        }else{
            for(int i = 0; i < this.topo + 1; i++){
                System.out.print(this.vetor[i] + " ");
            }
        }
    }
}
