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

  public Manager(String username, String password)
  {
    this.password = password;
    this.username = username;
  }
}
