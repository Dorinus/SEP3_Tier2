package tierTwo.networking.product;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.product.Product;
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

  @Override public boolean editProduct(Product editedProduct)
  {
    Gson gson = new Gson();
    String serializedBidding = gson.toJson(editedProduct);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITPRODUCT, serializedBidding);
    socketClient.communicate(networkRequest);
    return true;
  }

  @Override public boolean removeProduct(int id)
  {
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.REMOVEPRODUCT, String.valueOf(id));
    socketClient.communicate(networkRequest);
    return true;
  }

  @Override public Product getProduct(int id)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETPRODUCT, String.valueOf(id));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<Product>(){}.getType());
  }

  @Override public Product getActiveProducts(int pageNumber)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETACTIVEPRODUCTS, String.valueOf(pageNumber));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, Product.class);
  }
}
