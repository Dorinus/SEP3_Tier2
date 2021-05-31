package tierTwo.Services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tierTwo.models.user.User;
import tierTwo.networking.user.UserNetworking;

import java.util.List;

@Service
public class UserService implements IUserServices
{
  @Autowired UserNetworking userNetworking;

  public UserService(UserNetworking userNetworking)
  {
    this.userNetworking = userNetworking;
  }

  @Override public User validateUser(User user)
  {
    return userNetworking.validateUser(user);
  }

  @Override public List<User> getUsers(int pageNumber)
  {
     return userNetworking.geUsers(pageNumber);
  }

  @Override public String register(User user)
  {
    return userNetworking.register(user);
  }

  @Override public boolean editUser(User user)
  {
    return userNetworking.editUser(user);
  }

  @Override public boolean removeUser(int id)
  {
   userNetworking.removeUser(id);
    return false;
  }

  @Override public User getUserById(int id)
  {
    return userNetworking.getUserById(id);
  }
}
