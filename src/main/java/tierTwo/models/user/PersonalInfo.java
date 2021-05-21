package tierTwo.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class PersonalInfo
{
  @JsonProperty("firstName")
  private String firstName;
  @JsonProperty("lastName")
  private String lastName;
  @JsonProperty("dob")
  private String dob;
  @JsonProperty("card")
  private String card;
  @JsonProperty("cardDate")
  private String cardDate;
  @JsonProperty("email")
  private String email;
  @JsonProperty("address")
  private String address;
  @JsonProperty("postalIndex")
  private String postalIndex;

  public PersonalInfo(String firstName, String lastName, String dob, String email, String card, String cardDate, String address,
      String postalIndex)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.email = email;
    this.card = card;
    this.cardDate = cardDate;
    this.address = address;
    this.postalIndex = postalIndex;
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

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
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
}
