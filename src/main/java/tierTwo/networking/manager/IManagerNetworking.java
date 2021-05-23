package tierTwo.networking.manager;

import tierTwo.models.bidding.Bidding;
import tierTwo.models.manager.Manager;
import tierTwo.models.user.User;

import java.util.List;

public interface IManagerNetworking
{
  List<Manager> getAllUsers(int id);
  List<Bidding> getAllBiddings(int id);
  String editBidding(Bidding bidding);
  Manager validateManager(String username, String password);
}
