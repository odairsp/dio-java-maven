package javamaven;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class AssumptionsTeste {

    @Test
    void verificaUsuarioLogadoMaquina() {

        assumeTrue("ohinfo".equalsIgnoreCase(System.getenv("USERNAME")));
        assertEquals(10, 5 + 5);
    }
}
