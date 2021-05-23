package tierTwo.models.manager;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

@Component
public class Manager
{
  @JsonProperty("username")
  private String username;
  @JsonProperty("password")
  private String password;

  public Manager()
  {
    this.password = password;
    this.username = username;
  }

  public String getUserName()
  {
    return username;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public void setUsername(String username)
  {
    this.username = username;
  }
}
