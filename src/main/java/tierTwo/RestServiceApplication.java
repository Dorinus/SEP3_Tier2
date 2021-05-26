package tierTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tierTwo.networking.communication.ClientConnection;
import tierTwo.networking.communication.SocketClient;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.util.logging.LogRecord;

@SpringBootApplication
public class RestServiceApplication {


	public static void main(String[] args)
	{
    SocketClient client = new ClientConnection();
    client.startClient();
    SpringApplication.run(RestServiceApplication.class, args);
	}

}
