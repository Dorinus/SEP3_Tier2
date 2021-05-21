package tierTwo.Services.administrator;

import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public interface IAdministratorService
{
  List<User> getUsers(User user);
  String addUser(User user);
  List<Bidding> addBidding(Bidding bidding);
  String editBidding(Bidding bidding);
  void removeBidding(Bidding bidding);
  List<Bidding> showBiddings(Bidding bidding);
  String searchBiddings(Bidding bidding);
}
