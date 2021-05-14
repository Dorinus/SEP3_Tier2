package tierTwo.networking;

import tierTwo.models.User;

import java.util.List;

public interface UserSocket
{
  List<User> getUsers(int limit, int skiped);
}
