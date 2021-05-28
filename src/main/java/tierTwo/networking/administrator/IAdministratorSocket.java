package tierTwo.networking.administrator;

import tierTwo.models.administrator.Administrator;
import tierTwo.models.product.Product;
import tierTwo.models.user.User;

import java.util.List;

public interface IAdministratorSocket
{
  Administrator validateAdministrator(String username, String password);
  List<User> getAllUsers();
  List<Product> getAllBiddings();
  void deleteAccount(int id);
  void deleteBidding(int id);
  String editBidding(Product product);
  void addBidding(Product product);
}
