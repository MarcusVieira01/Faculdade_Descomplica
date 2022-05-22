//Programa que declara variáveis int, char e String, recebe um número inteiro para calcular a tabuada desse número e uma opção por qual tipode repetição deseja calcular a tabuada, calcule a tabuada via for, while e do/while exibindo o resultado

//Importação de biblioteca javax.swing.*
import javax.swing.*;
//Declaração de classe principal
class Estrutura_repeticao02{
    //Declaração do método principal
    public static void main(String entrada[]){
        //Declaração de variáveis e incializações pertinentes
        int tabuada;
        char op = 0;//Inicialização em 0 pois se o usuário não digitar nenhum valor, entrará no default. Caso seja vazio, dará erro de runtime
        String msg = "";
        String inputMsg = "Digite um número inteiro positivo para cálculo da sua tabuada";
        String opMsg = "Digite 1 para usar repetição for\nDigite 2 para usar repetição while\nDigite 3 para usar repetição do/while";
        String defMsg = "Opção de cálculo inválido!";

        //Atribuição dos valores de input pelo usuário, via uso de método da biblioteca swing e conversão para os tipos pertinentes
        tabuada = Integer.parseInt(JOptionPane.showInputDialog(inputMsg));
        op = JOptionPane.showInputDialog(opMsg).charAt(0);

        //
        switch(op){
            //Case usando loop for
            case '1':{
                //Atribuição de valores concatenados ao valor da variáve msg
                msg = msg + "A tabuada do numero " + tabuada + " via for é:\n\n";
                //Loop for que fará a execução do bloco enquanto a condição de parada não for atingida
                for(int i = 1; i <= 10; i++){
                    //Atribuição de valores concatenados e valor de resultado de expressão matemática ao valor da variáve msg
                    msg = msg + tabuada + " x " + i + " = " + (tabuada * i) + "\n";
                }
                //Uso da keyword break para que a estrutura switch_case seja encerrada
                break;
            }
            //Case usando loop while
            case '2':{
                //Atribuição de valores concatenados ao valor da variáve msg
                msg = msg + "A tabuada do numero " + tabuada + " via while é:\n\n";
                //Declaração e inicialização da variável de controle
                int ctrl = 1;
                ///Loop while que fará a execução do bloco enquanto a condição de parada não for atingida
                while(ctrl <= 10){
                    //Atribuição de valores concatenados e valor de resultado de expressão matemática ao valor da variáve msg
                    msg = msg + tabuada + " x " + ctrl + " = " + (tabuada * ctrl) + "\n";
                    //Incremento da variável de controle
                    ctrl++;
                }
                //Uso da keyword break para que a estrutura switch_case seja encerrada
                break;
            }
            //Case usando do/while
            case '3':{
                //Atribuição de valores concatenados ao valor da variáve msg
                msg = msg + "A tabuada do numero " + tabuada + " via do/while é:\n\n";
                //Declaração e inicialização da variável de controle
                int controle = 1;
                //Uso da keyword do para que o bloco de código seja executado, indepententemente da condição de parada
                do{
                    //Atribuição de valores concatenados e valor de resultado de expressão matemática ao valor da variáve msg
                    msg = msg + tabuada + " x " + controle + " = " + (tabuada * controle) + "\n";
                    //Incremento da variável de controle
                    controle++;
                }while(controle <= 10);//Uso da keyword while para definir a condição de parada
                //Uso da keyword break para que a estrutura switch_case seja encerrada
                break;
            }
            default: JOptionPane.showMessageDialog(null, defMsg);
        }
        //Condicional que validará o valor da variável op
        if(op >= '1' && op <= '3'){
            //Uso de método da biblioteca swing para exibição do conteúdo da variável msg
            JOptionPane.showMessageDialog(null, msg);
        }
        //Método que encerrará o programa
        System.exit(0);
    }   
}
