public class SaldoContaException extends Exception{
    //Declaração de atributo privado
    private float saldoConta;

    //Declaração de construtores
    public SaldoContaException (float saldo){
        //Herança do construtor da superclasse Exception
        super();
        //Atribuição do valor do argumento do construtor no atributo, autoreferenciado, saldoConta
        this.saldoConta = saldo;
    }
    public SaldoContaException(String msg){
        //Herança do construtor recebendo a mensagem pertinente para exeibição no stacktrace
        super(msg);
    }

    //Declaração de método getter
    public float getSaldoConta(){
        return this.saldoConta;
    }
}
