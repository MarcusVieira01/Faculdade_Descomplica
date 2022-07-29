import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeituraArquivo {
    //Declaração de método principal
    public static void main(String[] args) throws Exception{
        // Inserido por exigência do VS Code como um "fechamento" para um resource leak (PESQUISAR)
        try (
        //Instanciamento do objeto scanner do tipo Scanner advindo da classe Scanner
        Scanner scanner = new Scanner(System.in)) {
            //Exibição de mensagem solicitando caminho do arquivo a ser lido
            System.out.println("Informe o caminho absoluto do arquivo de texto: ");
            //Declaração de variável e atribuição do valor inserido pelo usuário via método .nextLine(), por se tratar de string, do objeto scanner
            String caminhoArquivo = scanner.nextLine();

            //Keyword que indicará tentativa de execução para tratamento de exceção
            try{
                //Instanciamento de objeto arquivo, do tipo FileReader e advindo da classe FileReader(pathFile), que será o arquivo a ser lido. Local no caso ../saida/arquivo.txt
                FileReader arquivo = new FileReader(caminhoArquivo);
                //Declaração de objeto reader, do tipo BufferedReader e advindo ca classe BufferedReader(objeto), que será o leitor do arquivo
                BufferedReader reader = new BufferedReader(arquivo);

                //Declaração de variável e atribuição do valor de retorno do método .readLine() do objeto reader onde será lida a primeira linha do arquivo
                String linha = reader.readLine();

                //Loop while que iterará todo o arquivo e executará o código
                while(linha != null){
                    //Exibição do valor da variável linha no prompt
                    System.out.println(linha);
                    //Atribuição do valor de retorno do método .readLine() do objeto reader onde será lida a linha subsequente do arquivo
                    linha = reader.readLine();
                }

                //Método que fechará o arquivo
                arquivo.close();

            //Tratamento de excessão do tipo IOException via variável e
            }catch(IOException e){
                //Exibição de mensagem pertinente, formatada com o retorno do método getMessage() do objeto e
                System.out.printf("Erro de leitura do arquivo! O caminho inserido: %s.", e.getMessage());
            }
        }
        
        //Exibição de uma quebra de linha no prompt
        System.out.println();
    }
}
