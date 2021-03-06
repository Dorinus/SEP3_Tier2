package tierTwo.models.product;

import java.util.Date;

public class Product
{
  private int id;
  private String name;
  private String description;
  private double price;
  private String date;
  private String photoUrl;

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

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String getDate()
  {
    return date;
  }

  public void setDate()
  {
    this.date = date;
  }

  public void setPhotoUrl (String photoUrl)
  {
    this.photoUrl = photoUrl;
  }
}
