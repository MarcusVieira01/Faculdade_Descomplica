//Importação de classes externas
import javax.swing.JOptionPane;

//Declaração de classe principal
public class Aula05_RecursaoComCauda {
    //Declaração de método principal
    public static void main(String[] args) {
        //Declaração de variáveis
        int nro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor maior ou igual a 0!"));

        //Condicional que caso o usuário digite um valor inválido para o cálculo do fatorial, será exibida mensagem, implementando o conceito de fail fast. Caso false, será exibido o valor de retorno do método fat(arg) de forma concatenada
        if(nro < 0){
            JOptionPane.showMessageDialog(null, "Número inválido. Digite um valor maior ou igual a 0!");
        }else{
            JOptionPane.showMessageDialog(null, "O fatorial de " + nro + " é " + fat(nro));
        }
    }

    //Método recursivo que fará o cálculo do fatorial
    public static int fat (int n){
        //Condicional que fará a parada da recursã caso true, usando o conceito de fail fast
        if(n == 0){
            //Retorno de valor estático
            return 1;
        }else{
            //Retorno do valor do fatorial calculado via chamada recursiva
            return n * fat(n - 1);
        }
    }
}
