package tierTwo.networking.user;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.user.User;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;

@Component
public class UserNetworking implements IUserNetworking
{
  @Autowired SocketClient socketClient;

  @Override public User validateUser(User user)
  {
    Gson gson = new Gson();
    String serializedAccount = gson.toJson(user);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.LOGIN, serializedAccount);
    String input = socketClient.communicate(networkRequest);
    System.out.println("Input is " + input);
    return gson.fromJson(input, User.class);
  }

  @Override public String register(User user)
  {
    Gson gson = new Gson();
    String serializedAccount = gson.toJson(user);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.REGISTER, serializedAccount);
    return socketClient.communicate(networkRequest);
  }

  @Override public boolean editUser(User user)
  {
    Gson gson = new Gson();
    String serializedAccount = gson.toJson(user);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITUSER, serializedAccount);
    return true;
  }

  @Override public boolean removeUser(int id)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.REMOVEUSER, String.valueOf(id));
    //socketClient.communicate(networkRequest);
    return true;
  }

  @Override public User getUserById(int id)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETUSERBYID, String.valueOf(id));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, User.class);
  }

  @Override public List<User> geUsers(int pageNumber)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETUSERS, String.valueOf(pageNumber));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<User>>(){}.getType());
  }
}
