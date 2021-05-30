package tierTwo.Services.product;

import tierTwo.models.product.Product;

import java.util.List;

public interface IProductService
{
  int addProduct(Product product);
  boolean editProduct(Product editedProduct);
  boolean removeProduct(int id);
  List<Product> getProduct(int id);
  List<Product> getActiveProducts(int pageNumber);
}
