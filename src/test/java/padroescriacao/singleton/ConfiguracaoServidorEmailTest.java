package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracaoServidorEmailTest {

    @Test
    public void deveRetornarHostSmtp() {
        ConfiguracaoServidorEmail.getInstance().setHostSmtp("smtp.empresa.com.br");
        assertEquals("smtp.empresa.com.br", ConfiguracaoServidorEmail.getInstance().getHostSmtp());
    }

    @Test
    public void deveRetornarPorta() {
        ConfiguracaoServidorEmail.getInstance().setPorta(587);
        assertEquals(587, ConfiguracaoServidorEmail.getInstance().getPorta());
    }

    @Test
    public void deveRetornarConfiguracaoValida() {
        ConfiguracaoServidorEmail.getInstance().setHostSmtp("smtp.empresa.com.br");
        ConfiguracaoServidorEmail.getInstance().setPorta(587);
        assertTrue(ConfiguracaoServidorEmail.getInstance().isConfiguracaoValida());
    }

    @Test
    public void deveRetornarConfiguracaoInvalidaQuandoHostNulo() {
        ConfiguracaoServidorEmail.getInstance().setHostSmtp(null);
        ConfiguracaoServidorEmail.getInstance().setPorta(587);
        assertFalse(ConfiguracaoServidorEmail.getInstance().isConfiguracaoValida());
    }

    @Test
    public void deveRetornarConfiguracaoInvalidaQuandoPortaZero() {
        ConfiguracaoServidorEmail.getInstance().setHostSmtp("smtp.empresa.com.br");
        ConfiguracaoServidorEmail.getInstance().setPorta(0);
        assertFalse(ConfiguracaoServidorEmail.getInstance().isConfiguracaoValida());
    }
}
