package tierTwo.models;

public class ProductBid
{
  private int productId;
  private int userId;
  private int newPrice;

  public ProductBid(int productId, int userId, int newPrice)
  {
    this.productId = productId;
    this.userId = userId;
    this.newPrice = newPrice;
  }

  public int getProductId()
  {
    return productId;
  }

  public int getUserId()
  {
    return userId;
  }

  public int getNewPrice()
  {
    return newPrice;
  }
}
