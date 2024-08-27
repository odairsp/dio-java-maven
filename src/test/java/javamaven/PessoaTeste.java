package javamaven;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa odair =  new Pessoa("Odair", "RG",LocalDate.of(1978,10,21));
        Assertions.assertEquals(45, odair.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa odair =  new Pessoa("Odair", "RG",LocalDate.of(1978,10,21));
        Assertions.assertTrue(odair.ehMaiorDeIdade());

        Pessoa gabriel =  new Pessoa("Gabriel","RG", LocalDate.of(2024,06,20));
        Assertions.assertFalse(gabriel.ehMaiorDeIdade());

    }



}
