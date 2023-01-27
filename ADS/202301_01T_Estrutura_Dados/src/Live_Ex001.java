import javax.swing.JOptionPane;

public class Live_Ex001 {
    public static void main(String[] args) {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
        }while(n <= 0 || n> 50);

        int[] vetor = new int[n];
        int[] pares = new int[n];
        int[] impares = new int [n];

        int countPares = 0, countImpares = 0;

        //entrada
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + i));
            
            if(vetor[i] % 2 == 0){
                pares[countPares] = vetor[i];
                countPares++;
            }else{
                impares[countImpares] = vetor[i];
                countImpares++;
            }
        }
        //Saída
        String mensagemA = "Vetor principal: \n";

        for(int i = 0; i < vetor.length; i++){
            mensagemA += vetor[i] + " ";
        }

        String mensagemB = "Vetor com elementos pares: \n";

        for(int i = 0; i < countPares; i++){
            mensagemB += pares[i] + " ";
        }

        String mensagemC = "Vetor com elementos impares: \n";

        for(int i = 0; i < countImpares; i++){
            mensagemC += impares[i] + " ";
        }

        JOptionPane.showMessageDialog(null, mensagemA + mensagemB + mensagemC);
    }
}    