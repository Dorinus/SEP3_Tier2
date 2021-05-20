package tierTwo.Services.administrator;

import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public interface IAdministratorService
{
  List<User> getUsers(User user);
  List<User> addUser(User user);
  List<Bidding> addBidding(Bidding bidding);
  List<Bidding> editBidding(Bidding bidding);
  List<Bidding> removeBidding(Bidding bidding);
  List<Bidding> showBiddings(Bidding bidding);
  List<Bidding> searchBiddings(Bidding bidding);
}
