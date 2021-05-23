package tierTwo.networking.administrator;

import tierTwo.models.administrator.Administrator;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public interface IAdministratorSocket
{
  Administrator validateAdministrator(String username, String password);
  List<User> getAllUsers(int id);
  List<Bidding> getAllBiddings(int id);
  void deleteAccount(int id);
  String editBidding(Bidding bidding);
  void addBidding(Bidding bidding);
}
