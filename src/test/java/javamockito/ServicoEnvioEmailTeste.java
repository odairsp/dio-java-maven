package javamockito;

import javamaven.Email;
import javamaven.Formato;
import javamaven.PlataformaDeEnvio;
import javamaven.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Teste da classe {@link ServicoEnvioEmail} exemplificando testes usando Argument Captor
 */
@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> emailCaptor;

    @Test
    public void validaSeEmailEstaComDadosCorretos() {

        String email = "jose.alve@provedor.com";
        String mensagem = "Mensagem de Teste 123";
        boolean ehHtml = false;

        servico.enviaEmail(email, mensagem, ehHtml);

        Mockito.verify(plataforma).enviaEmail(emailCaptor.capture());
        Email emailCapturado = emailCaptor.getValue();

        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());

    }

}
