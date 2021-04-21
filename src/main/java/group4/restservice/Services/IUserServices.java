package group4.restservice.Services;

import group4.restservice.models.User;

import java.io.IOException;

public interface IUserServices
{
  public User getUser() throws IOException, InterruptedException;
}
