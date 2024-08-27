package javamaven;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.iniciarConexao();

    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.insereDados(new Pessoa("Jonas","", LocalDate.of(2000, 10, 20)));
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("Jonas", "",LocalDate.of(2000, 10, 20)));
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
