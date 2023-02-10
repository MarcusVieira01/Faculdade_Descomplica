//Importação de bibliotecas externas
import javax.swing.JOptionPane;

//Declaração da classe principal
public class Aula05_RecursaoSemCauda {
    public static void main(String[] args) {
        //Declaração de variáveis
        int nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial!"));

        //Condicional que verificará se o valor do input do usuário é coerente ao cálculo do fatorial, onde é implementado o conceito fail fast
        if(nro < 0){
            //Exibição de mensagem informando que o valor inserido é incoerente ao cálculo do fatorial
            JOptionPane.showMessageDialog(null, "O número deve ser maior que 0!");
        }else{
            //Evocação de método recursivo
            fatP(nro, nro, 1);
        }

        //Encerramentto do programa com status 0
        System.exit(0);
    }

    //Método que será evocado para recursão sem cauda, calculando o fatorial do valor contido na variável n
    static void fatP(int n, int x, int f){
        //Condicional que fará a parada da recursão quando for true
        if(x ==0 || x ==1){
            JOptionPane.showMessageDialog(null, "Fatorial de " + n + " é " + f);
        }else{
            //Evocação recursiva para cálculo do fatorial
            fatP(n, x - 1, f * x);
        }
    }
}
