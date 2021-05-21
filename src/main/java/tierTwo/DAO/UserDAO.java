package tierTwo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tierTwo.models.Request;
import tierTwo.models.user.User;

@Repository
public class UserDAO implements IUserDAO
{
  @Autowired private Handler handler;

  @Override public User validateUser(User user) throws Exception
  {
    Request login = new Request("CheckLogin", user);
    handler.setObject(login);

    Request response = handler.messageExchange(login);
    System.out.println(" from dao up to the service " + response);
  }
}
