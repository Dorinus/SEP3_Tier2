package tierTwo.models.user;

public class User
{
  private int id;
  private String username;
  private String password;
  private String type;
  private String firstName;
  private String lastName;
  private String dob;
  private String card;
  private String cardDate;
  private String email;
  private String address;
  private String postalIndex;


  public User()
  {
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
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

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getDob()
  {
    return dob;
  }

  public void setDob(String dob)
  {
    this.dob = dob;
  }

  public String getCard()
  {
    return card;
  }

  public void setCard(String card)
  {
    this.card = card;
  }

  public String getCardDate()
  {
    return cardDate;
  }

  public void setCardDate(String cardDate)
  {
    this.cardDate = cardDate;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public String getPostalIndex()
  {
    return postalIndex;
  }

  public void setPostalIndex(String postalIndex)
  {
    this.postalIndex = postalIndex;
  }

  @Override public String toString()
  {
    return "User{" + "id=" + id + ", username='" + username + '\''
        + ", password='" + password + '\'' + ", type='" + type + '\''
        + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
        + ", dob='" + dob + '\'' + ", card='" + card + '\'' + ", cardDate='"
        + cardDate + '\'' + ", email='" + email + '\'' + ", address='" + address
        + '\'' + ", postalIndex='" + postalIndex + '\'' + '}';
  }
}
