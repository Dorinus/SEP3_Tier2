package tierTwo.models.product;

import java.util.Date;

public class Product
{
  private int id;
  private String name;
  private String description;
  private String price;
  private Date date;
  private transient byte[] photoUrl;

  public Product()
  {
    this.id = id;
    this.date = date;
    this.description = description;
    this.name = name;
    this.price = price;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getPrice()
  {
    return price;
  }

  public void setPrice(String price)
  {
    this.price = price;
  }

  public Date getDate()
  {
    return date;
  }

  public void setDate()
  {
    this.date = date;
  }

  public void setAvatar(byte[] photoUrl)
  {
    this.photoUrl = photoUrl;
  }
}
