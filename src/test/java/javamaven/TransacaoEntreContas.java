package javamaven;

public class TransacaoEntreContas {

    public void transfere(Conta constaOrigem, Conta contaDestino, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0!");
        }
    }
}
