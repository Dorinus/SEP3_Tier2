package tierTwo.Services.administrator;

import org.springframework.stereotype.Service;
import tierTwo.models.product.Product;
import tierTwo.models.user.User;

import java.util.List;

@Service
public class AdministratorService implements IAdministratorService
{

  @Override public List<User> getUsers(User user)
  {
    return null;
  }

  @Override public String addUser(User user)
  {
    return null;
  }

  @Override public List<Product> showBiddings(Product product)
  {
    return null;
  }

  @Override public String searchBiddings(Product product)
  {
    return null;
  }
}
