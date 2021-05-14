package tierTwo.controllers;



import org.springframework.web.bind.annotation.RequestBody;

public interface IUserController
{
  public User user();
  public boolean registerUser(@RequestBody User user);
}
