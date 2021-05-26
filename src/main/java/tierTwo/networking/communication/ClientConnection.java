package tierTwo.networking.communication;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

@Component
public class ClientConnection implements SocketClient
{
  @Override public void startClient()
  {
    try
    {
      new Thread(() -> communicate(new NetworkRequest(NetworkType.CONNECTION, "connectionFromTier2"))).start();
    }catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  @Override public String communicate(NetworkRequest networkRequest)
  {
    try
    {
      Gson gson = new Gson();
      Socket socket = new Socket("localhost", 8070);
      OutputStream outputStream = socket.getOutputStream();
      InputStream inputStream = socket.getInputStream();
      String request = gson.toJson(networkRequest);
      byte[] requestBytes = request.getBytes();
      outputStream.write(requestBytes);

      byte[] data = new byte[1024 * 1024];
      int count = inputStream.read(data);
      String string = new String(data);
      String updatedString = "";

      for(int i=0; i<string.length(); i++)
      {
        if(string.charAt(i) == 0)
        {
          break;
        }
        updatedString += string.charAt(i);
      }

      if(updatedString.equals("\"confirmation from tier3\""))
      {
        return updatedString;
      }
      else
      {
        System.out.println("Client connection problem");
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return null;
  }
}
