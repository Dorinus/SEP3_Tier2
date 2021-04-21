package group4.restservice.models;

public class User
{
  private String userName, password;
  private int id;

  public User(String userName, String password, int id)
  {
    this.userName = userName;
    this.password = password;
    this.id = id;
  }

  public void setUserName(String userName)
  {
    this.userName = userName;
  }

  public void setPassword(String password)
  {
    this.password = password;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getUserName()
  {
    return userName;
  }

  public String getPassword()
  {
    return password;
  }

  public int getId()
  {
    return id;
  }
}
