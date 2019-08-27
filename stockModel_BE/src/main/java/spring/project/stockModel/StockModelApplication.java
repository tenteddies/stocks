package spring.project.stockModel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StockModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockModelApplication.class, args);
	}

}
