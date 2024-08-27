package javamockito;

import javamaven.ApiDosCorreios;
import javamaven.CadastrarPessoa;
import javamaven.DadosLocalizacao;
import javamaven.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos", "rua 2", "", "Jardim Qualquer");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("1234567")).thenReturn(dadosLocalizacao);
        Pessoa odair = cadastrarPessoa.cadastrarPessoa("Odair", "RG", LocalDate.now().minusYears(45), "1234567");

        assertEquals("Odair", odair.getNome());
        assertEquals("MG", odair.getEndereco().getUf());
        assertEquals("Patos", odair.getEndereco().getCidade());
        assertEquals("RG", odair.getDocumento());
    }

}

//
//class outraForma{
//
//    @BeforeAll
//    static void setup(){
//        MockitoAnnotations.initMocks(this);
//
//        ApiDosCorreios apiDosCorreios = Mockito.mock(ApiDosCorreios.class);
//    }
//
//}
