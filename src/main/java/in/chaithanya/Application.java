package in.chaithanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.Service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		UserService userService=context.getBean(UserService.class);
		userService.saveUser();
		
	}

}
