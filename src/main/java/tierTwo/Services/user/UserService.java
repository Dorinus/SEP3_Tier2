package tierTwo.Services.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tierTwo.DAO.UserDAO;
import tierTwo.Services.user.IUserServices;
import tierTwo.models.user.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class UserService implements IUserServices
{
  @Autowired UserDAO userDAO;

  public UserService(UserDAO userDAO)
  {
    this.userDAO = userDAO;
  }

  @Override public User validateUser(User user) throws Exception
  {
    User loginUser = userDAO.validateUser(user);
    if (loginUser != null)
    {
      return loginUser;
    }
    return null;
  }
}
