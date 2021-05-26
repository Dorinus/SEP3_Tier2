package tierTwo.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

public class User
{
  private String username;
  private String password;
  private String type;
  private PersonalInfo personalInfo;
  private int id;

  public User()
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
