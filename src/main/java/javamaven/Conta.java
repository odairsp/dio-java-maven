package javamaven;

public class Conta {
    private Long numero;
    private Long saldo;

    public Conta(Long numero, Long saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void paarBoleto(Long valorAPagar) {
        validaSaldo(valorAPagar);
        debita(valorAPagar);
        enviaCreditoParaEmissor(valorAPagar);
    }

    public void validaSaldo(Long valorAPagar) {
        if (valorAPagar > saldo) {
            throw new IllegalStateException("Saldo Insuficiente!");
        }
    }

    public void enviaCreditoParaEmissor(Long valorAPagar) {
        // envia
    }

    public void debita(Long valorAPagar) {
        this.saldo -= valorAPagar;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }
}
