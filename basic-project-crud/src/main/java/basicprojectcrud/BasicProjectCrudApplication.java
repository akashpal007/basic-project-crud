package basicprojectcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableScheduling //If you uncomment it then HiiHelloScheduler Service will run
public class BasicProjectCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicProjectCrudApplication.class, args);
	}

}
