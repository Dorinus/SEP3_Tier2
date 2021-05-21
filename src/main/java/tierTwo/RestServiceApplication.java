package tierTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

@SpringBootApplication
public class RestServiceApplication {


	public static void main(String[] args)
	{
    Handler handler = new Handler();
    new Thread(() -> handler.run()).start();

    SpringApplication.run(RestServiceApplication.class, args);
	}

}
