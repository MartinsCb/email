package send.mail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Properties;

@ExtendWith(OutputCaptureExtension.class)
public class AppTest {
	@Test
	public void testEmail() {
		
		//configurando as propriedades
		
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");//autorização
		properties.put("mail.smtp.starttls","true");//segurança
		properties.put("mail.smtp.host","smtp.gmail.com");//servidor
		properties.put("mail.smtp.port","465");//porta do servidor
		properties.put("mail.smtp.socketFactory.port","465");//porta a ser conectada pelo socket
		properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");//classe spcket de conexão
		
		
	}

   
    }

