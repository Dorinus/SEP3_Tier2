package tierTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tierTwo.networking.communication.ClientConnection;
import tierTwo.networking.communication.SocketClient;

@SpringBootApplication
public class RestServiceApplication {


	public static void main(String[] args)
	{

    SpringApplication.run(RestServiceApplication.class, args);
    SocketClient client = new ClientConnection();
    client.startClient();
	}

}
