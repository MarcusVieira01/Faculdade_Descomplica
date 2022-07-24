import java.io.File;

public class DadosArquivo {
    //Declaração de classe principal
     public static void main(String[] args) throws Exception{
        //Instanciamento do objeto arquivo, advindo da classe File e com o caminho como argumento do construtor
        File arquivo = new File("../saida/arquivo.txt");

        //Condicional que usará o retorno do método .exists(), do objeto arquivo, como comparação e executará o trecho pertinente de código
        if(arquivo.exists()){
            //Exibição dos valores de retorno dos métodos do objeto arquivo, concatenados com as mensagens
            System.out.println("Nome do arquivo: " + arquivo.getName());
            System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
            System.out.println("Caminho: " + arquivo.getPath());
            System.out.println("Permissao de escrita? " + arquivo.canWrite());
            System.out.println("Permissao de leitura? " + arquivo.canRead());
            System.out.println("Tamanho: " + arquivo.length() + "b");
        }else{
            //Exibição de mensagem pertinente
            System.out.println("Arquivo inválido!");
        }
    }
}
