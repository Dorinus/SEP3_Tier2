package tierTwo.networking.manager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.product.Product;
import tierTwo.models.manager.Manager;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;
/*
@Component
public class ManagerNetworking implements IManagerNetworking
{

  @Autowired SocketClient socketClient;
  @Override public List<Manager> getAllUsers(int id)
  {
    Gson gson = new Gson();
    Manager manager = new Manager();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETALLMANAGERS, String.valueOf(id));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<Manager>>(){}.getType());
  }

  @Override public List<Product> getAllBiddings(int id)
  {
    Gson gson = new Gson();
    Product product = new Product();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETALLBIDDINGSBYID, String.valueOf(id));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<Product>>(){}.getType());
  }

  @Override public String editBidding(Product product)
  {
    Gson gson = new Gson();
    String serializedBidding = gson.toJson(product);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITBIDDING, serializedBidding);
    return socketClient.communicate(networkRequest);
  }

  @Override public Manager validateManager(String username, String password)
  {
    Gson gson = new Gson();
    Manager manager = new Manager();
    manager.setUsername(username);
    manager.setPassword(password);
    String serializedManager = gson.toJson(manager);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.LOGIN, serializedManager);
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, Manager.class);
  }
}
 */
