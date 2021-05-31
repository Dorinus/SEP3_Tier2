package tierTwo.networking.user;

import tierTwo.models.user.User;

import java.util.List;

public interface IUserNetworking
{
  User validateUser(User user);
  String register(User user);
  boolean editUser(User user);
  String changeType(int userId);
  boolean removeUser(int id);
  User getUserById(int id);
  List<User> geUsers(int pageNumber);
}
