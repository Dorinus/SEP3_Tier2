package tierTwo.networking.product;

import tierTwo.models.product.Product;

import java.util.List;

public interface IProductNetworking
{
  int addProduct(Product product);
  String editProduct(Product product);
  void deleteProduct(int id);
  List<Product> getProduct(int id);
}
