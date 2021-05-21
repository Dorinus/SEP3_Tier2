package tierTwo.models.administrator;

import org.springframework.stereotype.Component;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

@Component
public class Administrator implements IAdministrator
{
  @Override public List<User> getAllUsers(User user)
  {
    return null;
  }

  @Override public List<User> addUser(User user)
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

  @Override public void addBidding(Bidding bidding)
  {

  }

  @Override public void deleteBidding(Bidding bidding)
  {

  }

  @Override public void searchBiddings(Bidding bidding)
  {

  }
}
