package tierTwo.networking.product;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.product.Product;
import tierTwo.models.user.User;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;

@Component
public class ProductNetworking implements IProductNetworking
{
  @Autowired SocketClient socketClient;

  public ProductNetworking(SocketClient socketClient)
  {
    this.socketClient = socketClient;
  }

  @Override public int addProduct(Product product)
  {
    Gson gson = new Gson();
    String serializedProduct = gson.toJson(product);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.ADDPRODUCT, serializedProduct);
    String input = socketClient.communicate(networkRequest);
    System.out.println("Input is " + input);
    return gson.fromJson(input, int.class);
  }

  @Override public String editProduct(Product product)
  {
    Gson gson = new Gson();
    String serializedBidding = gson.toJson(product);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITBIDDING, serializedBidding);
    socketClient.communicate(networkRequest);
    return serializedBidding;
  }

  @Override public void deleteProduct(int id)
  {
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.DELETEBIDDING, String.valueOf(id));
    socketClient.communicate(networkRequest);
  }

  @Override public List<Product> getProductById(int id)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETALLBIDDINGSBYID, String.valueOf(id));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<Product>>(){}.getType());
  }
}
