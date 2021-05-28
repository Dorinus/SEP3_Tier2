package tierTwo.models.administrator;

public class Administrator
{
  private String username;
  private String password;
  private String type;

  public Administrator()
  {
    this.password = password;
    this.username = username;
    this.type = type;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String username)
  {
    this.username = username;
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
}
