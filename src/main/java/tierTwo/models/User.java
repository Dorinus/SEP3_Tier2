package tierTwo.models;

public class User
{
  private String userName, password, type;
  private PersonalInfo personalInfo;
  private int id;

  public User(String userName, String password, String type, PersonalInfo personalInfo, int id)
  {
    this.userName = userName;
    this.password = password;
    this.type = type;
    this.personalInfo = personalInfo;
    this.id = id;
  }

  public String getUserName()
  {
    return userName;
  }

  public void setUserName(String userName)
  {
    this.userName = userName;
  }

  public String getPassword()
  {
    return password;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public String getType()
  {
    return type;
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public PersonalInfo getPersonalInfo()
  {
    return personalInfo;
  }

  public void setPersonalInfo(PersonalInfo personalInfo)
  {
    this.personalInfo = personalInfo;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }
}
