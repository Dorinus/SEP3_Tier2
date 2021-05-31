package tierTwo.networking.bid;

import tierTwo.models.product.Product;

import java.util.List;

public interface IBidNetworking
{
boolean bid(int id, int newPrice);
String getBidWinner(int productId);
List<Product> getUserBids(int userId);
}
