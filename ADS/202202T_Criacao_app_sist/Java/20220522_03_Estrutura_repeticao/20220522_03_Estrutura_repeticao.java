//Programa que declara variáveis int, char e String, recebe dois números inteiros e uma opção, calcula a soma dos números se forem pares, calcula a somatória do primeiro número pelas vezes do valor do segundo número e exibe as informações;

//Importação de biblioteca externa
import javax.swing.*;
//Declaração de classe principal
class Estrutura_repeticao03{
    //Declaração de método principal
    public static void main(String entrada[]){
        //Declaração de variáveis
        int num1, num2, soma = 0, somatoria = 0;
        char op = '0';
        String inptMsg1 = "Digite um número inteiro";
        String inptMsg2 = "Digite outro número inteiro";
        String opMsg = "Digite 1 para adição\nDigite 2 para somatória";
        String dfltMsg = "Nenhuma opção válida foi digitada";
        String msg = "";

        //Atribução dos valores de input, via método da biblioteca swing, com conversão para os tipos pertinentes
        num1 = Integer.parseInt(JOptionPane.showInputDialog(inptMsg1));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(inptMsg2));
        op = JOptionPane.showInputDialog(opMsg).charAt(0);

        //Uso da estrutura switch_case para que seja executado o bloco de código pertinente ao input pelo usuário ao valor da variável op
        switch(op){
            case '1':{
                //Condicional aninhado que validará o resultado da expressão matemática
                if(num1 % 2 == 0 && num2 % 2 == 0){
                    //Atribuição do valor de resultado da expressão matemática à variável soma e atribuição de concatenção à variável msg
                    soma = num1 + num2;
                    msg = msg + "A soma entre " + num1 + " e " + num2 + " é " + soma;
                }if(num1 % 2 != 0 && num2 % 2 == 0){
                    msg = msg + ("O número " + num1 + " é ímpar!");
                }if(num1 % 2 == 0 && num2 % 2 != 0){
                    msg = msg + ("O número " + num2 + " é impar!");
                }
                //Uso da keyword break para que seja finalizada a estrutura swith_case
                break;
            }
            case '2':{
                //Loop for que fará a repetição do bloco de código enquanto a condição de parada nçao for atingida
                for(int i = 0; i < num2; i++){
                    //Atribuição do valor de resultado da expressão matemática à variável somatoria
                    somatoria = somatoria + num1;
                }
                //Atribuição de concatenção à variável msg
                msg = msg + "A somatória de " + num1 + " " + num2 + " vezes é " + somatoria;
                //Uso da keyword break para que seja finalizada a estrutura switch_case
                break;
            }
            //Exibição de mensagem pertinente em caso padrão
            default: System.out.println(dfltMsg);
        }
        //Condicional que validará o valor da variável op e exibirá o conteúdo da variável msg
        if(op == '1' || op == '2'){
            System.out.println(msg);
        }
        //Método para encerramento do programa
        System.exit(0);
    }
}
