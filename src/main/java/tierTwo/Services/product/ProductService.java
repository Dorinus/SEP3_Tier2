package tierTwo.Services.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tierTwo.models.product.Product;
import tierTwo.networking.product.ProductNetworking;

import java.util.List;

@Service
public class ProductService implements IProductService
{
  @Autowired ProductNetworking productNetworking;

  public ProductService(ProductNetworking productNetworking)
  {
    this.productNetworking = productNetworking;
  }

  @Override public int addProduct(Product product)
  {
    return productNetworking.addProduct(product);
  }

  @Override public boolean editProduct(int id)
  {
    return true;
  }

  @Override public  boolean removeProduct(int id)
  {
    productNetworking.removeProduct(id);
    return true;
  }

  @Override public List<Product> getProduct(int id)
  {
    return productNetworking.getProduct(id);
  }
}
