package javamaven;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa odair =  new Pessoa("Odair", LocalDateTime.of(1978,10,21,12,0,0));
        Assertions.assertEquals(45, odair.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa odair =  new Pessoa("Odair", LocalDateTime.of(1978,10,21,12,0,0));
        Assertions.assertTrue(odair.ehMaiorDeIdade());

        Pessoa gabriel =  new Pessoa("Gabriel", LocalDateTime.of(2024,06,20,7,1,0));
        Assertions.assertFalse(gabriel.ehMaiorDeIdade());

    }



}
