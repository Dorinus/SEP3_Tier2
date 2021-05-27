package tierTwo.models.manager;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public class Manager
{
  private String username;
  private String password;
  private String type;

  public Manager()
  {
    this.password = password;
    this.username = username;
    this.type = type;
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
  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }
}
