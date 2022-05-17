//Programa que declare variáveis int, double e String, recebe dois números via swing, calcula divisão inteira e potência do primeiro número elevado ao segundo e exibe os resultados via swing;

//Importação da biblioteca javax.swing.* via keyword import
import javax.swing.*;

//Definição da classe de execução
class Usando_swing_pratica{
    public static void main(String entrada[]){
        //Declaração de variáveis
        int num1, num2, div;
        double pot;
        String msg;

        //Atribuição do valor de input via método JOptionPane.showInputDialog(args) da biblioteca javax.swing.*
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));

        //Atribuição do valor de resultado da expressão matemática, com conversão direta para int, onde o operador / retornará a parte inteira do resultado da divisão
        div = (int)num1 / (int)num2;
        //Atribuição do valor de retorno do método Math.pow(arg, arg) onde será retornada a potência do valor de num1 elevado ao valor de num2
        pot = Math.pow(num1, num2);

        //Concatenação dos valores das vairáveis num1, num2, div e pot
        msg = "Os números são " + num1 + " e " + num2 + "\n";
        msg = msg + "A divisão inteira é " + div + "\n";
        msg = msg + "A potência de " + num1 + " elevado a " + num2 + " é " + pot + "\n";

        //Exibição do valor da variável msg
        JOptionPane.showMessageDialog(null, msg);
        //Método que encerrará o programa
        System.exit(0);
    }
}
