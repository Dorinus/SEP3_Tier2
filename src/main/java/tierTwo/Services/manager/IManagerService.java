package tierTwo.Services.manager;

import org.springframework.stereotype.Service;
import tierTwo.models.product.Product;

@Service
public interface IManagerService
{
  String editBidding(Product product);
}
