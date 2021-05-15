package tierTwo.networking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.Bidding;
import tierTwo.models.user.PersonalInfo;
import tierTwo.models.user.User;

import java.util.Date;
import java.util.List;

@Component
public class AdminSocket implements IAdminSocket
{
  private Gson gson;

  @Autowired ServerConnection serverConnection;

  @Override public List<User> getUsers(String userName, String password,
      String type, PersonalInfo personalInfo, int id)
  {
    return null;
  }

  @Override public List<Bidding> addBidding(String name, String description,
      String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> editBidding(String name, String description,
      String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> removeBidding(String name, String description,
      String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> showBiddings(String name, String description,
      String price, int id, Date date)
  {
    return null;
  }

  @Override public List<Bidding> searchBiddings(String name, String description,
      String price, int id, Date date)
  {
    return null;
  }
}
