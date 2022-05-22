//Programa que declara variáveis int e double, recebe dois números inteiros, calcula soma, produto, diferença e a divisão de dois inteiros usando modularização além de exibir todos os resultados

//Importação de biblioteca externa
import javax.swing.*;

//Declaração de classe principal
class Modularizacao01{
    //Declaração de método secundário com parâmetros soma, sem retorno
    public static void soma(int x, int y){
        //Declaração de variável, atribuição de valor inicial e resultado de operação matemática
        int sum = x + y;
        //Exibição do valor contatenado das variáveis x, y e sum
        JOptionPane.showMessageDialog(null, "A soma de " + x + " e " + y + " é " + sum);
    }
    //Declaração de método secundário com parâmetros subtração sem retorno
    public static void subtracao(int x, int y){
        //Declaração de variável
        int sub = x - y;
        //Exibição do valor contatenado das variáveis x, y e sub
        JOptionPane.showMessageDialog(null, "A subtração de " + x + " e " + y + " é " + sub);
    }
    //Declaração de método secundário com parâmetros produto()
    public static int produto(int x, int y){
        //Declaração de variável
        int produt = x * y;
        //Retorno do valor da variável produt para o programa usando a keyword return
        return produt;
    }
    //Declaração de método secundário divisao com parâmetros
    public static double divisao(int x, int y){
        //Declaração de variável
        double divis = (double)x / (double)y;
        //Retorno do valor da variável divisao para o programa usando a keyword return
        return divis;
    }
    //Declaração do método principal
    public static void main(String entrada[]){
        //Declaração de variáveis
        int num1, num2, prod;
        double div;
        //Declaração de variáveis e atribuição do valor de inicialização
        String msgInp1 = "Digite um valor inteiro";
        String msgInp2 = "Digite outro valor inteiro";
        //Atribuição dos valores de input pelo usuário, via método de input da biblioteca swing e a conversão pertinente de tipo
        num1 = Integer.parseInt(JOptionPane.showInputDialog(msgInp1));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(msgInp2));
        //Evocação das funções declaradas préviamente
        soma(num1, num2);
        subtracao(num1, num2);
        //Atribuição do valor de retorno da função produto(arg, arg) à variável prod e div
        prod = produto(num1, num2);
        div = divisao(num1, num2);
        //Exibição, via método da biblioteca swing, o valor da variável prod e div
        JOptionPane.showMessageDialog(null, "O valor do produto entre " + num1 + " e " + num2 + " é " + prod); 
        JOptionPane.showMessageDialog(null, "O valor da divisão entre " + num1 + " e " + num2 + " é " + div); 
        //Uso do método para finalização do programa
        System.exit(0);
    }
}
