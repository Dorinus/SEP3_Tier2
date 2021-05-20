package tierTwo.Services.user;

import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

public interface IUserServices
{
  User registerUser(User user);
  Bidding enterBidding();

}
