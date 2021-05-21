package tierTwo.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class User
{
  @JsonProperty("username")
  private String username;
  @JsonProperty("password")
  private String password;
  @JsonProperty("type")
  private String type;
  @JsonProperty("personalInfo")
  private PersonalInfo personalInfo;
  @JsonProperty("id")
  private int id;

  public User(String username, String password, String type, PersonalInfo personalInfo, int id)
  {
    this.username = username;
    this.password = password;
    this.type = type;
    this.personalInfo = personalInfo;
    this.id = id;
  }



   public String getUserName()
  {
    return username;
  }

   public String getPassword()
  {
    return password;
  }

   public String getType()
  {
    return type;
  }

   public PersonalInfo getPersonalInfo()
  {
    return personalInfo;
  }

   public int getId()
  {
    return id;
  }

  public void setUserName(String username)
  {
    this.username = username;
  }
  public void setPassword(String password)
  {
    this.password = password;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public void setPersonalInfo(PersonalInfo personalInfo)
  {
    this.personalInfo = personalInfo;
  }

  public void setId(int id)
  {
    this.id = id;
  }


}
