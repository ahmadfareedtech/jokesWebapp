package guru.springframework.JokesWebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokesWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesWebappApplication.class, args);
	}

}
