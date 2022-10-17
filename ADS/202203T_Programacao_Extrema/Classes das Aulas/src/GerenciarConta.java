import java.util.Scanner;

public class GerenciarConta {
    //Declaração de atributos privados
    private float saldoAtual = 15000f;

    //Declaração de método com a lógica sobre adicionar um valor à conta instanciada, lançando uma exceção pertinente
    public float adicionaValor(float montante) throws SaldoContaException{
        //Declaração de variável e atribuição do valor de resultado da expressão matemática
        float total = saldoAtual + montante;

        //Condicional que comparará o valor da variável total e em caso true, lançara a exceção e no caso false retornará o valor da variávle total
        if(total > 20000){
            throw new SaldoContaException(total);
        }else{
            return total;
        }
    }

    //Declaração de método com a lógica da criação de depósito fixo
    public void criaDepositoFixo(float valorFixo){
        //IMPLEMENTAÇÃO AUSENTE
    }

    //Declaração de método principal
    public static void main(String[] args) {
        //Estrutura try obrigatória pelo VS Code para tratar resource leak
        try (
        //Instanciamento de objeto da classe Scanner e atribuída sua referencia à variável inputDevice
        Scanner inputDevice = new Scanner(System.in)) 
        {
            //Exibição de mensagem
            System.out.println("Por favor, inisra um valor a ser acrescentado em seu saldo: ");

            //Declaração de varipavel e atribuição do valor de retorno do método nextFloat() advindo o objeto da referencia inputDevice
            float novoValor = inputDevice.nextFloat();

            //Estrutura try-catch-finally para captura de exceções e tratamento
            try{
                //Instanciamento de novo objeto advindo da classe GerenciaConta, evocação de método adicionaValor(args) e atribuição de seu retorno à variável valorTotal
                float valorTotal = new GerenciarConta().adicionaValor(novoValor);
                
                //Exibição concatenada do valor da variável valorTotal
                System.out.println("O valor total da conta e: " + valorTotal);
            }catch(SaldoContaException a){
                //Declaração de variável e atribuição do valor de resultado da expressão matemática, sendo que o primeiro termo é o retorno do método contido na classe SaldoContaExeption de referência a 
                float fdAmount = a.getSaldoConta() - 20000;
                
                //Exibição de valor da variável fdAmount concatenada
                System.out.println("Agora o saldo da sua conta e superior a 20000, criando um FD de quantia " + fdAmount);

                //Instanciamento de objeto da classe GerenciarConta via construtor padrão e evocação de metodo interno
                new GerenciarConta().criaDepositoFixo(fdAmount);

                //Exibição de mensagem
                System.out.println("Valor da conta e " + 20000);
            }
        }
    }    
}
