package tierTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.rmi.NotBoundException;

@SpringBootApplication
public class RestServiceApplication {

	//We start tier 2 here

	public static void main(String[] args) throws IOException, InterruptedException, NotBoundException
	{
		SpringApplication.run(RestServiceApplication.class, args);

	}

}
