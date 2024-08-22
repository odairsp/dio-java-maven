package javamaven;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();

    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Jonas", LocalDateTime.of(2000, 10, 20, 15, 0)));
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("Jonas", LocalDateTime.of(2000, 10, 20, 15, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        assertTrue(true);
        System.out.println("Teste 1");
    }

    @Test
    void validarDadosDeRetorno2() {
        assertNull(null);
        System.out.println("Teste 2");
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        ;

    }
}
