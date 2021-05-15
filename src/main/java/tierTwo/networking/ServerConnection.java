package tierTwo.networking;

import com.google.gson.Gson;
import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Component;
import tierTwo.models.ActionType;
import tierTwo.models.ActualRequest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Component
public class ServerConnection implements IServerConnection
{

  @Override public ActualRequest requestToServer(ActualRequest actualRequest)
  {
    try
    {
      Socket socket = new Socket("localhist", 2910);
      InputStream inputStream = socket.getInputStream();
      OutputStream outputStream = socket.getOutputStream();
      Gson gson = new Gson();

      Request request = actualRequest.getRequest();
      List<byte[]> images = actualRequest.getImages();

      if(images != null && !images.isEmpty())
      {
        System.out.println("There are " + images.size() + " images to be sent");
        List<Integer> imageSize = new ArrayList<>();

        for(byte[] image : images)
        {
          imageSize.add(image.length);
        }

        Request informAboutImagesRequest = new Request(ActionType.HAS_IMAGES, imageSize);
        String informAboutImagesAsJson = gson.toJson(informAboutImagesRequest);

        outputStream.write(informAboutImagesAsJson.getBytes();

        String confirmImages = readFromStream(inputStream);

        for(byte[] image: images)
        {
          outputStream.write(image);
        }
      }

      String requestAsJson = gson.toJson(request);

      outputStream.write(requestAsJson.getBytes());

      String received = readFromStream(inputStream);
      Request receivedResponse = gson.fromJson(received, Request.class);

      if(receivedResponse.getActionType().equals(ActionType.HAS_IMAGES))
      {
        List<Double> incomingIamgesSizesAsDouble = (List<Double>) receivedResponse.getArgument();
        List<Integer> incomingImageSizes = new ArrayList<>();

        for(Double sizesAsDouble : incomingIamgesSizesAsDouble)
        {
          incomingImageSizes.add(sizesAsDouble.intValue());
        }

        System.out.println("Going to receive " + incomingImageSizes.size() + " image");
        List<byte[]> incomingImages = new ArrayList<>();
        byte[] temp;
        for(Integer incomingImagesSize : incomingImageSizes)
        {
          temp = inputStream.readNBytes(incomingImagesSize);
          System.out.println("Read image with length " + temp.length);
          incomingImages.add(temp);
        }

        String receivedRequestResponse = readFromStream(inputStream);
        System.out.println("Received " + receivedRequestResponse+ "" + receivedRequestResponse.length());
        Request requestResponse = gson.fromJson(receivedRequestResponse, Request.class);
        return new ActualRequest(receivedResponse, null);
      }
      else
      {
        return new ActualRequest(requestResponse, incomingImages);
      }
      else
      {
        return new ActualRequest(receivedResponse, null);
      }

    }
    catch (Exception e)
    {
      System.out.println("Sockets connection error");
    }
    return null;
  }
  private String readFromStream(InputStream inputStream) throws IOException
  {
    byte[] readBytes = new byte[65535];
    int readResultLength = inputStream.read(readBytes);
    String received = new String(readBytes, 0, readResultLength);
    System.out.println("Received " + received + "" + received.length());
    return received;
  }
}
