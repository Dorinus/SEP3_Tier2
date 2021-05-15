package tierTwo.Services;

import tierTwo.models.user.User;

import java.io.IOException;

public interface IUserServices
{
  public User getUser() throws IOException, InterruptedException;
}
