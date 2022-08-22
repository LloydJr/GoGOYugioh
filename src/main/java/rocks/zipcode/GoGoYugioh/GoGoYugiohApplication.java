package rocks.zipcode.GoGoYugioh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class GoGoYugiohApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoGoYugiohApplication.class, args);
	}

}
