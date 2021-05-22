package tierTwo.DAO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import tierTwo.models.Request;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@Component
public class Handler implements Runnable
{
  private InputStream input;
  private OutputStream output;
  private Socket socket;
  private ObjectMapper objectMapper;
  private Request object;

  public Handler()
  {
    try
    {
      socket = new Socket("127.0.0.1", 8000 );
      output = socket.getOutputStream();
      input = socket.getInputStream();
      objectMapper = new ObjectMapper();
      object = new Request();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  void setObject(Request object)
  {
    this.object = object;
  }

  @Override public void run()
  {
    while(true){
      try{
        byte[] dataFromClient = new byte[8000];
        int bytesRead = input.read(dataFromClient, 0, dataFromClient.length);
        String readObject = new String(dataFromClient);
        //gson json to object
        //do whatever with it
      }
      catch (Exception e){

      }
    }
  }

  public Request messageExchange(Request objectToSend)
  {
    byte[] toClient;
    byte[] dataFromClient = new byte[8000];

    try
    {
      toClient = objectMapper.writeValueAsBytes(objectToSend);
      output.write(toClient, 0, toClient.length);
    }
    catch (IOException ioException)
    {
      throw new RuntimeException(ioException.getMessage());
    }

    try
    {
      int bytesRead = input.read(dataFromClient, 0, dataFromClient.length);
      String readObject = new String(dataFromClient);
      Request finalObject = objectMapper.readValue(readObject, Request.class);
      System.out.println("Returned message from db to handler " + readObject);
      return finalObject;
    }catch (IOException e)
    {
      throw new RuntimeException(e.getMessage());
    }
  }
}
