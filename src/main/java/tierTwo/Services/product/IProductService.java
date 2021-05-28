package tierTwo.Services.product;

import tierTwo.models.product.Product;

import java.util.List;

public interface IProductService
{
  void addProduct(Product product);
  String editProduct(Product product);
  void deleteProduct(int id);
}
