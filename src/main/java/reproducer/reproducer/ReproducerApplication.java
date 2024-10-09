package reproducer.reproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootConfiguration
@EnableAutoConfiguration
public class ReproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReproducerApplication.class, args);
	}

}
