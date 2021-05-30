package tierTwo.networking.product;

import tierTwo.models.product.Product;

import java.util.List;

public interface IProductNetworking
{
  int addProduct(Product product);
  boolean editProduct(int id);
  boolean removeProduct(int id);
  List<Product> getProduct(int id);
}
