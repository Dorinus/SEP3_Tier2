package tierTwo.Services.product;

import tierTwo.models.product.Product;

import java.util.List;

public interface IProductService
{
  List<Product> addProduct(Product product);
  String editProduct(Product product);
  void removeProduct(Product product);
}
