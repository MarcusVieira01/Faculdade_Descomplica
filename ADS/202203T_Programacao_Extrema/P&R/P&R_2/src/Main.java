import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    //Declaração de método principal
    public static void main(String[] args) throws IOException{
        //Inserida estrutura try por exigência do VSCode. Acusava o objeto scanner como resource leak no caso de não uso da destrutura
        try (
            //Instanciamento do objeto scanner, advindo da classe Scanner 
            Scanner scanner = new Scanner(System.in)) {
            //Exibição de mensagem pertinente
            System.out.println("Insira o nome e extensão do arquivo: ");
            //Declaração de variável e atribuição do input pelo usuário, via método nextLine() do objeto scanner
            String caminhoArquivo = scanner.nextLine();

            //Declaração de variáveis e atribuição de valor de inicialização, sendo as inicializações do Input Stream (is) e do OUtput Stream (os)
            InputStream is = null;
            OutputStream os = null;

            //Estrutura de try/catch/finally que fará a captura de exceções e tratamento
            try {
                //Instanciamento de objetos e atribuição nas variáveis pertinentes
                is = new FileInputStream(caminhoArquivo);
                os = new FileOutputStream("copia de " + caminhoArquivo);
                //Declaração de variávele instanciamento de novo objeto com tamanho delimitado em 1024bytes. Variável armazenará o buffer do arquivo
                byte[] buffer = new byte[1024];
                //Declaração de variável que não estava especificada no passo a passo
                int length;
                //Loop while que fará a leitura do arquivo antigo, dentro do condicional, armazenará em buffer e fará o loop a cada 1024bytes
                while((length = is.read(buffer)) > 0){
                    //Evocação do método write(args) do objeto os, que fará a escrita do arquivo anterior no novo arquivo
                    os.write(buffer, 0, length);
                }
                //Estrutura catch que exibirá mensagem pertinente, formatada, para a excessão encontrada
            } catch (Exception e) {
                //Exibição de mensagem de erro pertinente
                System.out.printf("Erro na leitura do arquivo %s.\n", e.getMessage());
                //Estrutura finally que executa o bloco de código indiferente se houver exceção ou não
            } finally{
                //Evocação de método close() dos objetos is e os, que fecharão os streams de dados
                is.close();
                os.close();
            }
        }
    }
}
