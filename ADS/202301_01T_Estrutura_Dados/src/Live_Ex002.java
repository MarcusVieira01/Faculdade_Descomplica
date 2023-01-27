import javax.swing.JOptionPane;

public class Live_Ex002 {
    public static void main(String[] args) {
        int matriz[][] = new int [3][2];
        int mult = 1;

        //entrada
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição [" + i + "][" + j + "]"));
                mult *= matriz[i][j];
            }
        }

        //Saída
        String mensagemA = "Valores da matriz: \n";

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                mensagemA += matriz[i][j] + " ";
            }
            mensagemA += "\n";
        }
        mensagemA += "Resultado da multiplicação: " + mult;

        JOptionPane.showMessageDialog(null, mensagemA);
    }
}
