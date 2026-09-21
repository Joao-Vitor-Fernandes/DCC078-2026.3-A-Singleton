package padroescriacao.singleton;

public class ConfiguracaoServidorEmail {

    private ConfiguracaoServidorEmail() {}
    private static ConfiguracaoServidorEmail instance = new ConfiguracaoServidorEmail();
    public static ConfiguracaoServidorEmail getInstance() {
        return instance;
    }

    private String hostSmtp;
    private int porta;

    public String getHostSmtp() {
        return hostSmtp;
    }

    public void setHostSmtp(String hostSmtp) {
        this.hostSmtp = hostSmtp;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public boolean isConfiguracaoValida() {
        if (this.hostSmtp != null && this.porta > 0) {
            return true;
        }
        return false;
    }
}
