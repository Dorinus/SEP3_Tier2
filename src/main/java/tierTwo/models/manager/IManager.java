package tierTwo.models.manager;

import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public interface IManager
{
  public List<User> getAllUsers(User user);
  public List<Bidding> getAllBiddings(Bidding bidding);
  public void editBidding(Bidding bidding);
}

