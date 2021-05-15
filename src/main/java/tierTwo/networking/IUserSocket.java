package tierTwo.networking;

import tierTwo.models.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public interface IUserSocket
{
  List<Integer> userLoginOrOut(int userId, boolean loggedOut);
  List<Bidding> showBiddings();
  List<Bidding> searchBidding();
}
