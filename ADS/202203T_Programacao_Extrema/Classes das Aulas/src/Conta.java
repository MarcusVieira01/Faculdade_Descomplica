public class Conta {
    //Declaração de atributos privados
    private String contaCorrente;
    private double saldo;

    //Declaração de construtor automático
    public Conta(String contaCorrente, double saldo) {
        this.contaCorrente = contaCorrente;
        this.saldo = saldo;
    }

    //Declaração de métodos getter e setter automáticos
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Declaração de método sobrecarregado toString
    @Override
    public String toString() {
        return "C.C " + this.contaCorrente + " || Saldo R$" + this.saldo;
    }
}
