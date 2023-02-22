import javax.swing.JOptionPane;

//Importação de classe externa


//Declaração de classe principal
public class Aula07_PilhaMain {
    public static void main(String[] args) {
        //Declaração de variável e atribuição do valor de retorno do input do usuário após parse via classe wrapper
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho da pilha desejada"));

        //Instanciação de objeto da classe Aula07_Pilha, passando no construtor o argumento de tamanho
        Aula07_Pilha pilha = new Aula07_Pilha(tamanho);

        for(int i = 0; i < tamanho; i++ ){
            pilha.empilhar(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o elemento desejado")));
        }

        //Evocação de método que exibirá a pilha, desempilhará o último elemento exibíndo-o e mostrará a pilha
        pilha.mostrarPilha();

        System.out.println("\n" + pilha.desempilhar());

        pilha.mostrarPilha();

        //Evocação de método para encerramento do programa com status 0
        System.exit(0);
    }
}
