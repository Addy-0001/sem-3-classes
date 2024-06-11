package project.adam.gymfitpro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class GymfitproApplication {

	private static final Logger logger = LoggerFactory.getLogger(GymfitproApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GymfitproApplication.class, args);
		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
		System.out.println(welcomeMessage);
		logger.info("Logging is working and something has changed");
		WelcomeMessage welcome = new WelcomeMessage();

		System.out.println(welcome.getWelcomeString());

		
	}

}
