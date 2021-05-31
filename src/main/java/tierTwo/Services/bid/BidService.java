package tierTwo.Services.bid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tierTwo.models.product.Product;
import tierTwo.networking.bid.BidNetworking;
import tierTwo.networking.category.CategoryNetworking;

import java.util.List;

@Service
public class BidService implements IBidService
{
  @Autowired BidNetworking bidNetworking;
  @Override public boolean bid(int id, int newPrice)
  {
    return bidNetworking.bid(id, newPrice);
  }

  @Override public String getBidWinner(int productId)
  {
    return bidNetworking.getBidWinner(productId);
  }

  @Override public List<Product> getUserBids(int userId)
  {
    return bidNetworking.getUserBids(userId);
  }
}
