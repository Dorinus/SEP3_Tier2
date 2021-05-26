package tierTwo.networking.bidding;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.bidding.Bidding;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;

public class BiddingNetworking implements IBiddingNetworking
{
  @Autowired SocketClient socketClient;

  @Override public void addBidding(Bidding bidding)
  {
    Gson gson = new Gson();
    String serializedBidding = gson.toJson(bidding);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.ADDBIDDING, serializedBidding);
    socketClient.communicate(networkRequest);
  }

  @Override public void editBidding(Bidding bidding)
  {
    Gson gson = new Gson();
    String serializedBidding = gson.toJson(bidding);
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.EDITBIDDING, serializedBidding);
    socketClient.communicate(networkRequest);
  }

  @Override public void deleteBidding(int id)
  {
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.DELETEBIDDING, String.valueOf(id));
    socketClient.communicate(networkRequest);
  }

  @Override public List<Bidding> getBiddingById(int id)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest = new NetworkRequest(NetworkType.GETALLBIDDINGSBYID, String.valueOf(id));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<Bidding>>(){}.getType());
  }
}
