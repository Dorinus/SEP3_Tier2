package tierTwo.networking.product;

import tierTwo.models.product.Product;

import java.util.List;

public interface IProductNetworking
{
  void addProduct(Product product);
  void editProduct(Product product);
  void deleteProduct(int id);
  List<Product> getProductById(int id);
}
