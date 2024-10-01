package br.com.senac.api;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerQueue {
    @JmsListener(destination = "teste_fila",
            containerFactory = "defaultFactory")
    public void receiveMessage(TesteFila mensagem) {
        System.out.println("Mensagem da fila:" + mensagem.getNome());
    }
}
