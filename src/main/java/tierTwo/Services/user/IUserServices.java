package tierTwo.Services.user;

import tierTwo.models.user.User;

import java.util.List;

public interface IUserServices
{
  User validateUser(User user);
  List<User> getUsers(int pageNumber);
  String register(User user);
  boolean editUser(User user);
  boolean removeUser(int id);
  User getUserById(int id);
}
