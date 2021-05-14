package tierTwo.Services;

import tierTwo.models.User;

import java.io.IOException;

public interface IUserServices
{
  public User getUser() throws IOException, InterruptedException;
}
