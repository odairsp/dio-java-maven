package javamaven;

public class Conta {
    private Long numero;
    private Long saldo;

    public Conta(Long numero, Long saldo) {
        this.numero = numero;
        this.saldo = saldo;
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
