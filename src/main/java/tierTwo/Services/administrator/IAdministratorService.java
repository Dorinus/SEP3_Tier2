package tierTwo.Services.administrator;

import tierTwo.models.product.Product;
import tierTwo.models.user.User;

import java.util.List;

public interface IAdministratorService
{
  List<User> getUsers(User user);
  String addUser(User user);
  List<Product> showBiddings(Product product);
  String searchBiddings(Product product);
}
