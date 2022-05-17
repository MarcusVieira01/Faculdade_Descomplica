//Programa declara variáveis int, double e String, recebe dois números usando a interface com usuário (swing), calcula o resto da divisão, raiz quadrada do primeiro e segundo e exibe os resultados;

//Importação de módulo externo swing via keyword import
import javax.swing.*;

//Declaração da classe, via keyword class
class Usando_swing{
    //Método principal declarado como public sendo encapsulamento sem restrição, static onde não haverá alteração no runtime, void onde não haverá retorno de valores
    public static void main (String entrada[]){
        //Declaração de variáveis
        int num1, num2, mod;
        double raiz1, raiz2;
        String msg;
        
        //Atribuição dos valores de input via swing exibindo uma caixa de diálogo com a mensagem pertinente e com a caixa de input, com conversão para int
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));

        //Atribuição do valor de resultado da expressão matemática, usando o operador % que retornará o resto da divisão dos dois valores das variáveis
        mod = num1 % num2;
        //Atribuição do valor de retorno do método Math.sqrt(arg) que será o valor da raiz quadrada do valor do argumento
        raiz1 = Math.sqrt(num1);
        raiz2 = Math.sqrt(num2);

        //Concatenação formatada dos valores das variáveis num1, num2, mod, raiz1 e raiz2
        msg = "Os números inseridos foram " + num1 + " e " + num2 + "\n";
        msg = msg + "O resto da divisão é " + mod + "\n";
        msg = msg + "A raiz quadrada de " + num1 + " é " + raiz1 + "\n";
        msg = msg + "A raiz quadrada de " + num2 + " é " + raiz2 + "\n";

        //Exibição do valor da variável msg via método de exibição e caixa de diálogo da biblioteca swing
        JOptionPane.showMessageDialog(null, msg);
        //Método que encerrará o programa
        System.exit(0);
    }
}
