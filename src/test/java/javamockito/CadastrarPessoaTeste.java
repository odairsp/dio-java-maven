package javamockito;

import javamaven.ApiDosCorreios;
import javamaven.CadastrarPessoa;
import javamaven.DadosLocalizacao;
import javamaven.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Patos", "rua 2", "", "Jardim Qualquer");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(ArgumentMatchers.anyString())).thenReturn(dadosLocalizacao);
        Pessoa odair = cadastrarPessoa.cadastrarPessoa("Odair", "RG", LocalDate.now().minusYears(45), "1234567");


        assertEquals("Odair", odair.getNome());
        assertEquals(dadosLocalizacao.getUf(), odair.getEndereco().getUf());
        assertEquals(dadosLocalizacao.getCidade(), odair.getEndereco().getCidade());
        assertEquals(dadosLocalizacao.getLogradouro(), odair.getEndereco().getLogradouro());
    }

    @Test
    void lancarExceptionQuandoChamarApiCprreios() {

//        Mockito.when(apiDosCorreios.
//                buscaDadosComBaseNoCep(ArgumentMatchers.anyString())).thenThrow(IllegalArgumentException.class);
//
        Mockito.doThrow(IllegalArgumentException.class).when(apiDosCorreios)
                .buscaDadosComBaseNoCep(ArgumentMatchers.anyString());


        Assertions.assertThrows(IllegalArgumentException.class, () ->
                cadastrarPessoa.cadastrarPessoa("Odair", "RG",
                        LocalDate.now().minusYears(45), "1234567")
        );

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
