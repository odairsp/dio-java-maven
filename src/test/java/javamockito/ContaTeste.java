package javamockito;

import javamaven.Conta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

    @Spy
    private Conta conta = new Conta(123L, 1579300L);

    @Test
    void validarOrdemDeChamadas(){

        conta.paarBoleto(300L);
        InOrder inOrder = Mockito.inOrder(conta);
        inOrder.verify(conta).paarBoleto(ArgumentMatchers.anyLong());
        inOrder.verify(conta).validaSaldo(300L);
        inOrder.verify(conta).debita(300L);
        inOrder.verify(conta).enviaCreditoParaEmissor(300L);
    }
    @Test
    void validarQuantidadeDeChamadas(){
        conta.validaSaldo(500L);
        conta.validaSaldo(540L);
        conta.validaSaldo(600L);

        Mockito.verify(conta,Mockito.times(3)).validaSaldo(ArgumentMatchers.anyLong());
    }

    @Test
    void retornaTrueParaQualquerValorNaValidaoDeSaldo(){
        Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyLong());
        conta.validaSaldo(2500000000L);
    }
}
