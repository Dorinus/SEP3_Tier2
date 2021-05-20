package tierTwo.Services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.ActualRequest;
import tierTwo.models.bidding.Bidding;
import tierTwo.networking.ServerConnection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Component
public class SocketUtilMethods
{
  private Gson gson;

  @Autowired private ServerConnection serverConnection;

  public SocketUtilMethods()
  {
    gson = new Gson();
  }

  public boolean requestWithBooleanReturnTypeWithoutImages(Request request)
  {
    ActualRequest requestResponse = serverConnection.requestToServer(new ActualRequest(request, null));
    if(requestResponse == null || requestResponse.getRequest() == null)
    {
      return false;
    }
    Boolean bool = gson.fromJson(requestResponse.getRequest().getArgument().toString(), Boolean.class);
    System.out.println("Boolean request result is " + bool);
    return bool;
  }

  public int requestWithIntegerReturnTypeWithoutImages(Request request)
  {
    ActualRequest requestResponse = serverConnection.requestToServer(new ActualRequest(request, null));
    if(requestResponse == null || requestResponse.getRequest() == null)
    {
      return -1;
    }
    Integer integer = gson.fromJson(requestResponse.getRequest().getArgument().toString(), Integer.class);
    System.out.println("Integer request result is " + integer);
    return integer;
  }

  public List<Bidding> requestBidWithImage(Request request)
  {
    ActualRequest response = serverConnection.requestToServer(new ActualRequest(request, null));
    if(response == null || response.getRequest() == null)
    {
      return null;
    }
    List<Bidding> biddings = new ArrayList<>();
    if(response.getRequest().getArgument() == null || response.getImages() == null)
    {
      return biddings;
    }
    Type biddingListType = new TypeToken<List<Bidding>>() {}.getType();
    biddings = gson.fromJson(response.getRequest().getArgument().toString(), biddingListType);
    for(int i = 0; i < biddings.size(); i++)
    {
      biddings.get(i).setId(response.getImages().get(i));
    }
    return biddings;
  }
}
