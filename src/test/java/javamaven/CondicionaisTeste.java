package javamaven;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "OHINFO")
    void verificaUsuarioLogadoMaquina() {


        assertEquals(10, 5 + 5);
    }
}
