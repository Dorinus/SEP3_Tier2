package tierTwo.models.manager;

import org.springframework.stereotype.Component;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

@Component
public class Manager implements IManager
{

  @Override public List<User> getAllUsers(User user)
  {
    return null;
  }

  @Override public List<Bidding> getAllBiddings(Bidding bidding)
  {
    return null;
  }

  @Override public void editBidding(Bidding bidding)
  {

  }
}
