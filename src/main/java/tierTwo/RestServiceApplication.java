package tierTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tierTwo.DAO.Handler;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.logging.LogRecord;

@SpringBootApplication
public class RestServiceApplication {


	public static void main(String[] args)
	{
    Handler handler = new Handler();
    
    Thread t1 = new Thread(handler);
    t1.start();
    SpringApplication.run(RestServiceApplication.class, args);
	}

}
