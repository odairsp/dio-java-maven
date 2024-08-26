package javamaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {


    @Test
    void validaExceptionNaTransferencia(){
        Conta origem =  new Conta(1233123L,123L);
        Conta destino =  new Conta(232323L,343L);

        TransacaoEntreContas transacaoEntreContas = new TransacaoEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, ()->
                transacaoEntreContas.transfere(origem, destino, 0)
                );
    }
}
