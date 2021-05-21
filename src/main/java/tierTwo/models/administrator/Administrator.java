package tierTwo.models.administrator;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;
import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

@Component
public class Administrator
{
  @JsonProperty("username")
  private String username;
  @JsonProperty("password")
  private String password;

  public Administrator(String username, String password)
  {
    this.password = password;
    this.username = username;
  }
}
