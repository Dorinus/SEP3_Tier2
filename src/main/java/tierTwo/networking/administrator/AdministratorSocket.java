package tierTwo.networking.administrator;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.administrator.Administrator;
import tierTwo.models.product.Product;
import tierTwo.models.user.User;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;

@Component
public class AdministratorSocket implements IAdministratorSocket
{

  @Autowired SocketClient socketClient;
  /*

  @Override public Administrator validateAdministrator(String username,
      String password)
  {
    Gson gson = new Gson();
    Administrator administrator = new Administrator();
    administrator.setPassword(password);
    administrator.setUsername(username);
    String serializedAdministrator = gson.toJson(administrator);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.LOGIN, serializedAdministrator);
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, Administrator.class);
  }

  @Override public List<User> getAllUsers()
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETUSERS, null);
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<User>>(){}.getType());
  }

  @Override public List<Product> getAllBiddings()
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETBIDDINGS, null);
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<Product>>() {}.getType());
  }

  @Override public void deleteAccount(int id)
  {
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.DELETEACCOUNT, String.valueOf(id));
    socketClient.communicate(networkRequest);
  }

  @Override public void deleteBidding(int id)
  {
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.DELETEBIDDING, String.valueOf(id));
    socketClient.communicate(networkRequest);
  }

  @Override public String editBidding(Product product)
  {
    Gson gson = new Gson();
    String serializedBidding = gson.toJson(product);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITBIDDING, serializedBidding);
    return socketClient.communicate(networkRequest);
  }

  */
}
