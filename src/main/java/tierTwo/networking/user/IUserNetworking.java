package tierTwo.networking.user;

import tierTwo.models.user.User;

public interface IUserNetworking
{
  User validateUser(User user);
  String register(User user);
  String editUser(User user);
  void deleteUser(int id);
  User getUserById(int id);
}
