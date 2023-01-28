import javax.swing.JOptionPane;

public class Aula02_SomaMatriz {
    public static void main(String[] args) {
        //
        int matriz[][] = new int[10][12];
        int soma = 0;

        //
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 11; coluna++) {
                //
                matriz[linha][coluna] = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Insira um número inteiro para a posição " + 
                                                       "[" + linha + "][" + coluna + "]"));
                //
                soma += matriz[linha][coluna];
            }
        }
        //
        JOptionPane.showMessageDialog(null, "A soma dos 120 elementos é " + soma);
    }
}
