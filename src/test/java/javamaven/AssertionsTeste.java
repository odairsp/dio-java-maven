package javamaven;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class AssertionsTeste {

    @Test
    void validarLancamento() {
        int[] primeiroLancamento = {10, 20, 30, 34, 50};
        int[] segundoLancamento = {10, 20, 30, 34, 50};
        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Joao","123456", LocalDate.now().minusYears(25));

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){

        double valor = 5d;
        double outroValor = 5.0;
        assertEquals(valor, outroValor);

    }


}
