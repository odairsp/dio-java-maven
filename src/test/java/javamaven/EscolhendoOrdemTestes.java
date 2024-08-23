package javamaven;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoOrdemTestes {

//    @Order(4)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);

    }

//    @Order(3)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);

    }
//    @Order(2)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);

    }
//    @Order(1)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);

    }
}
