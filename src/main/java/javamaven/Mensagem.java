package javamaven;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Mensagem {

    private String id;
    private String mensagem;
    private LocalDateTime dataMsg;

    public Mensagem(final String mensagem) {
        this.id = UUID.randomUUID().toString();
        this.mensagem = mensagem;
        this.dataMsg = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDateTime getDataMsg() {
        return dataMsg;
    }
}
