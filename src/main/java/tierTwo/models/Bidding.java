package tierTwo.models;

import java.util.Date;

public class Bidding
{
  private String name;
  private String description;
  private String price;
  private int id;
  private Date date;

  public Bidding(String name, String description, String price, int id, Date date)
  {
    this.date = date;
    this.id = id;
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
}
