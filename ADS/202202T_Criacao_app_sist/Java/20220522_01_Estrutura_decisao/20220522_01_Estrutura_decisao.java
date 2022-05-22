//Programa que declara variáveis int, char e String, recebe uma opção e um número inteiro, calcula se o número é par ou impar, positivo ou negativo e apresenta apenas a opção selecionada via saída no terminal ou swing

//Importação de biblioteca externa javax.swing.*
import javax.swing.*;

//Declaração de classe principal
class Estrutura_decisao01{
    //Declaração de método principal
    public static void main(String entrada []){
        //Declaração e incialização de variáveis
        int num1 = 0;
        char op = '0';//Inicialização em 0 pois se o usuário não digitar nenhum valor, entrará no default. Caso seja vazio, dará erro de runtime
        String msg = "";
        String inputMsg = "Digite um número inteiro";
        String opMsg = "Digite 1 para definir o numero como par ou impar\nDigite 2 para definir o número como positivo ou negativo";
        String defMsg = "Opção inválida!";

        //Atribuição de valor de input, fornecido pelo usuários, via caixa de diálogo de input usando método da biblioteca swing. Cada input é covertido para seu tipo específico
        num1 = Integer.parseInt(JOptionPane.showInputDialog(inputMsg));
        op = (JOptionPane.showInputDialog(opMsg)).charAt(0);

        //Uso de estrutura switch_case para definir, via input pelo usuário, qual bloco de código seré executado
        switch(op){
            case '1':{
                //Condicional que verificará se o valor de resultado é igual a 0, onde executará o bloco pertinente
                if(num1 %2 == 0){
                    msg = msg + num1 + " é par!";
                }else{
                    msg = msg + num1 + " é impar!";
                }
                //Uso da keyword break para encerrar a estrutura switch_case
                break;
            }
            case '2':{
                //Condicional aninhado que fará os testes lógicos e executará o bloco pertinente
                if(num1 > 0){
                    msg = msg + num1 + " é positivo!";
                }if(num1 < 0){
                    msg = msg + num1 + " é negativo!";
                }else{
                    msg = msg + num1 + " é nulo, ou seja, igual a 0!";
                }
                //Uso da keyword break para encerrar a estrutura switch_case
                break;
            }
            //Uso da keyword default para definir o procedimento padrão para a situação de nenhum input do argumento op seja válido;
            default: JOptionPane.showMessageDialog(null, defMsg);
        }
        //Condicional que validará o valor da variável op
        if(op ==1 || op ==2){
            //Uso de método da biblioteca swing para exibição do conteúdo da variável msg
            JOptionPane.showMessageDialog(null, msg);
        }
        //Método que encerrará o programa
        System.exit(0);
    }
}
