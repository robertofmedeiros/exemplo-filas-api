package br.com.senac.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;

@SpringBootTest
class ExemploFilasApiApplicationTests {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Test
	public void testeFila() {
		jmsTemplate.convertAndSend("teste_fila", new TesteFila("Teste", "Teste"));
	}

}
