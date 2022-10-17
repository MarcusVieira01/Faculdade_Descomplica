import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscritaArquivo {
    //Declaração do método Main
    public static void main(String[] args) throws Exception {
        //Keyword que indicará tentativa de execução para tratamento de exceção
        try (
        //Instanciamento de objeto scanner advindo da classe Scanner()
        Scanner scanner = new Scanner(System.in)) {
            //Exibe mensagem ao usuário pedindo a quantidade de linhas necessárias no arquivo
            System.out.println("Informe o numero de linhas do arquivo:");
            //Declaração de variável e atribuição do valor de input do usuário, mia método .nextInt() do objeto scanner 
            int numeroLinhas = scanner.nextInt();

            //Instanciamento do objeto arquivo, tipo FileWriter, advindo da classe FileWriter(pathFile e fileName)
            FileWriter arquivo = new FileWriter("D:/Repositórios/Faculdade_Descomplica/ADS/202203T_Programacao_Extrema/Aula04/saida/arquivo.txt");
            //Instanciamento do objeto writer, tipo PrintWriter, advindo da classe PrintWriter(fileName)
            PrintWriter writer = new PrintWriter(arquivo);

            //Loop for que iterará uma quantidade de vezes definida pela comparação, escrevendo uma mensagem concatenada com o valor da variável de controle, no arquivo pertinente
            for (int i = 1; i <= numeroLinhas; i++){
                //Método que insere a mensagem pertinente, concatenada com o valor da variável de controle, no objero arquivo
                writer.println("Esta e a linha número " + i);
            }

            //Método evocado para fechamento do arquivo que foi escrito. Método do objeto arquivo
            arquivo.close();
        }

        //Exibição em prompt da mensagem pertinente
        System.out.println("Arquivo escrito com sucesso.");
    }
}
