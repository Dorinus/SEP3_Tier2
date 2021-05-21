package tierTwo.models.user;

import org.springframework.stereotype.Component;

@Component
public class LoginCredentials
{
  private String username;
  private String password;

  public LoginCredentials(String username, String password)
  {
    this.username = username;
    this.password = password;
  }

  public String getUsername()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }
}
