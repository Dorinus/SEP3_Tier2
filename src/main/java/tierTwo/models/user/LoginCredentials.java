package tierTwo.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class LoginCredentials
{
  @JsonProperty("username")
  private String username;
  @JsonProperty("password")
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
