package group4.restservice.models;

public class User
{
  private String username, password;
  private int id;

  public User(String username, String password, int id)
  {
    this.username = username;
    this.password = password;
    this.id = id;
  }

  public String getUsername()
  {
    return username;
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
