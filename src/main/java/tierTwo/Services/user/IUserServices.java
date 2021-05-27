package tierTwo.Services.user;

import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public interface IUserServices
{
  User validateUser(User user);
  List<User> getUsers(int pageNumber);

}
