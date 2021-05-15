package tierTwo.networking;

import com.google.gson.Gson;
import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Component;
import tierTwo.models.ActionType;
import tierTwo.models.Bidding;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserSocket implements IUserSocket
{
  private Gson gson;

  public UserSocket()
  {
    gson = new Gson();
  }

  @Override public List<Integer> userLoginOrOut(int userId, boolean loggedOut)
  {
    List<Integer> in = new ArrayList<>();
    in.add(userId);
    int booleanIn = isLogout ? 1:0;
    in.add(booleanIn);
    Request request = new Request(ActionType.USER_LOGOUTORIN, in);
    return socketsUtilMethods.getIntegerList(request);
  }

  @Override public List<Bidding> showBiddings()
  {
    return null;
  }

  @Override public List<Bidding> searchBidding()
  {
    return null;
  }
}
