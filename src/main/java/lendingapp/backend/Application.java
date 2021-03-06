package lendingapp.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*
@EnableSwagger2
*/

@ComponentScan("SecurityConfig")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
