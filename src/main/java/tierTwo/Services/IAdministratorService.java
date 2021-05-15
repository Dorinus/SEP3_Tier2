package tierTwo.Services;

import tierTwo.models.Bidding;
import tierTwo.models.user.PersonalInfo;
import tierTwo.models.user.User;

import java.util.Date;
import java.util.List;

public interface IAdministratorService
{
  List<User> getUsers(String userName, String password, String type, PersonalInfo personalInfo, int id);
  List<Bidding> addBidding(String name, String description, String price, int id, Date date);
  List<Bidding> editBidding(String name, String description, String price, int id, Date date);
  List<Bidding> removeBidding(String name, String description, String price, int id, Date date);
  List<Bidding> showBiddings(String name, String description, String price, int id, Date date);
  List<Bidding> searchBiddings(String name, String description, String price, int id, Date date);
}
