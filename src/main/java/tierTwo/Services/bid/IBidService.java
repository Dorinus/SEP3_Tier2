package tierTwo.Services.bid;

import tierTwo.models.product.Product;

import java.util.List;

public interface IBidService
{
  boolean bid(int id, int newPrice);
  String getBidWinner(int productId);
  List<Product> getUserBids(int userId);
}
