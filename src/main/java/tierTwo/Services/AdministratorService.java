package tierTwo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tierTwo.models.Bidding;
import tierTwo.models.user.PersonalInfo;
import tierTwo.models.user.User;
import tierTwo.networking.AdminSocket;

import java.util.Date;
import java.util.List;

public class AdministratorService implements IAdministratorService
{
  @Autowired AdminSocket adminSocket;

  @Override public List<User> getUsers(String userName, String password, String type, PersonalInfo personalInfo, int id)
  {
    return null;
  }

  @Override public List<Bidding> addBidding(String name, String description, String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> editBidding(String name, String description, String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> removeBidding(String name, String description, String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> showBiddings(String name, String description, String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> searchBiddings(String name, String description, String price, int id, Date date)
  {
    return null;
  }
}
