package tierTwo.networking.administrator;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.administrator.Administrator;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;

@Component
public class AdministratorSocket implements IAdministratorSocket
{

  @Autowired SocketClient socketClient;

  @Override public Administrator validateAdministrator(String username,
      String password)
  {
    return null;
  }

  @Override public List<User> getAllUsers(int id)
  {
    return null;
  }

  @Override public List<Bidding> getAllBiddings(int id)
  {
    return null;
  }

  @Override public void deleteAccount(int id)
  {

  }

  @Override public String editBidding(Bidding bidding)
  {
    return null;
  }

  @Override public void addBidding(Bidding bidding)
  {
    Gson gson = new Gson();
    String serializedBidding = gson.toJson(bidding);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.ADDBIDDING, serializedBidding);
    socketClient.communicate(networkRequest);
  }
}
