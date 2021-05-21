package tierTwo.Services.administrator;

import org.springframework.stereotype.Service;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

@Service
public class AdministratorService implements IAdministratorService
{

  @Override public List<User> getUsers(User user)
  {
    return null;
  }

  @Override public String addUser(User user)
  {
    return null;
  }

  @Override public List<Bidding> addBidding(Bidding bidding)
  {
    return null;
  }

  @Override public String editBidding(Bidding bidding)
  {
    return null;
  }

  @Override public void removeBidding(Bidding bidding)
  {

  }

  @Override public List<Bidding> showBiddings(Bidding bidding)
  {
    return null;
  }

  @Override public String searchBiddings(Bidding bidding)
  {
    return null;
  }
}
