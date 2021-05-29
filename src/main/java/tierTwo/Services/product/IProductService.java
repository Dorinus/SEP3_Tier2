package tierTwo.Services.product;

import tierTwo.models.product.Product;

import java.util.List;

public interface IProductService
{
  int addProduct(Product product);
  String editProduct(Product product);
  void removeProduct(int id);
  List<Product> getProduct(int id);
}
