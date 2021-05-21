package tierTwo.models.user;

import org.springframework.stereotype.Component;

@Component
public class User implements IUser
{
  private String username, password, type;
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



  @Override public String getUserName()
  {
    return username;
  }

  @Override public String getPassword()
  {
    return password;
  }

  @Override public String getType()
  {
    return type;
  }

  @Override public PersonalInfo getPersonalInfo()
  {
    return personalInfo;
  }

  @Override public int getId()
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
