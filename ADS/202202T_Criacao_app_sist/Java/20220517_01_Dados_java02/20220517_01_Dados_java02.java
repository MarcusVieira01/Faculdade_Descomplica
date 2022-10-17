//Programa que declara variáveis int, double e string, recebe dois números pela linha de comando, calcula o resto da divisão, quociente, raiz quadrada do primeiro número e potencia do primeiro número elevado ao segundo com exibição dos resultados;
class Dados_java02{
    public static void main(String entrada[]){
        //Declaração de variáveis
        int num1Int,num2Int, mod;
        double div, raiz, pot;
        String msg;

        //Atribuição dos valores de entrada via linha de comando às variáveis pertinentes, com conversão de string para int
        num1Int = Integer.parseInt(entrada[0]);
        num2Int = Integer.parseInt(entrada[1]);

        //Atribuição do valor de resultado da expressão matemática, onde é usada a divisão de resto com o operador %
        mod = num1Int % num2Int;
        //Atribuição do valor de resultado da expressão matemática, onde é usada a divisão normal com operador /
        div = num1Int / num2Int;
        //Atribuição do valor de retorno do método Math.sqrt(par), que retornará a raiz quadrada do valor do parâmetro
        raiz = Math.sqrt(num1Int);
        //Atribuição do valor de retorno do método Math.pow(par, par), que retornará a potência do primeiro parâmtro elevado ao segundo
        pot = Math.pow(num1Int, num2Int);

        //Concatenação dos valores da variável msg onde formatará o valor das variáveis  mod, div, raiz e pot
        msg = "Temos dois números " + num1Int + " e " + num2Int + " onde\n";
        msg = msg + "Seu resto da divisão será " + mod + ",\n";
        msg = msg + "Sua divisão inteira será " + div + ",\n";
        msg = msg + "A raiz quadrada do primeiro número é " + raiz + ",\n";
        msg = msg + "E a potencia entre " + num1Int + " e " + num2Int + " é " + pot + ".\n";

        //Exibição do valor da variável msg
        System.out.println(msg);

        //Método que fará o encerramento do programa
        System.exit(0);
    }
}
