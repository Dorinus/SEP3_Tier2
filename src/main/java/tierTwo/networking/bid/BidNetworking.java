package tierTwo.networking.bid;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.product.Product;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;

@Component
public class BidNetworking implements IBidNetworking
{
  @Autowired SocketClient socketClient;
  @Override public boolean bid(int id, int newPrice)
  {
    return true;
  }

  @Override public String getBidWinner(int productId)
  {
    Gson gson = new Gson();
    String serializedWinner = gson.toJson(productId);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETBIDWINNER, String.valueOf(productId));
    return socketClient.communicate(networkRequest);
  }

  @Override public List<Product> getUserBids(int userId)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETUSERBIDS, String.valueOf(userId));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<Product>>(){}.getType());
  }
}
