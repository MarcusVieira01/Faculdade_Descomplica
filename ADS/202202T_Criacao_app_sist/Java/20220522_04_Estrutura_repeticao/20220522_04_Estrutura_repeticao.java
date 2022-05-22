//Programa que declara variáveis int, char e String, recebe dois números inteiros e uma opção, calcula o produto de dois números se forem positivos, calcula a produtória do primeiro número pela quantidade de vezes do segundo número e exibe as informações

//Importação da biblioteca externa
import javax.swing.*;

//Declaração da classe principal
class Produto_produtoria01{
    //Declaração do método principal
    public static void main(String entrada[]){
        //Declaração de variáveis tipo string com atribuição das mensagens pertinentes (poderia ser um array com os valores em cada elemento)
        String inptMsg1 = "Insira um valor inteiro";
        String inptMsg2 = "Insira outro valor inteiro";
        String opMsg = "Digite 1 para o produto dos dois números\nDigite 2 para a produtória dos dois numeros";
        String negMsg = "Um dos números é negativo e dessa forma não foi realizado cálculo";
        String dfltMsg = "Nenhuma opção válida foi inserida";
        String msg = ""; 
        //Declaração de variáveis e suas incializações pertinentes
        int num1, num2, prod = 1, produtoria = 1;
        char op = '0';//Inicialização em 0 pois se o usuário não digitar nenhum valor, entrará no default. Caso seja vazio, dará erro de runtime

        //Atribuição do valor de input pelo usuário via método da biblioteca javax.swing, após conversão para os tipos pertinentes
        num1 = Integer.parseInt(JOptionPane.showInputDialog(inptMsg1));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(inptMsg2));
        op = (JOptionPane.showInputDialog(opMsg)).charAt(0);

        //Estrutura switch_case que executará o bloco pertinente ao valor da variável op
        switch(op){
            case '1':{
                //Condicional que validará os resultados das expressões matemáticas
                if(num1 > 0 && num2 > 0){
                    //Atribuição do valor de resultado da expressão matemática à variável prod e atribuição da concatenação de strings à variável msg
                    prod = num1 * num2;
                    msg = "O produto entre " + num1 + " e " + num2 + " é " + prod;
                }else{
                    //Atribuição do valor da variável negMsg em msg para o condicional resultar em false
                    msg = negMsg;
                }
                //Uso da keyword break para finalizar a estrutura switch_case
                break;
            }
            case '2':{
                //Loop for que executará o bloco de códifo enquanto a condição de parada não for atingida
                for(int ctrl = 0; ctrl < num2; ctrl++){
                    //Atribuição do valor de resultado da expressão matemática à variável produtoria
                    produtoria = produtoria * num1;
                }
                //Atribuição da concatenação à variável msg
                msg = "A produtória de " + num1 + ", " + num2 + " vezes é " + produtoria;
                //Uso da keyword break para finalizar a estrutura switch_case
                break;
            }
            default: JOptionPane.showMessageDialog(null, dfltMsg);
        }
        //Condicional que validará o valor da variável op e exibirá o conteúdo da variável msg
        if(op == '1' || op == '2'){
            JOptionPane.showMessageDialog(null, msg);
        }
        //Método que encerrará o programa
        System.exit(0);
    }
}
