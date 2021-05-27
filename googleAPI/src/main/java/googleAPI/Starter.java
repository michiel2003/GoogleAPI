package googleAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"googleAPI.entitys", "googleAPI.controllers"})
public class Starter {
	
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
	
}
