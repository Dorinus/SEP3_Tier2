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

  @Override public List<Product> addProduct(Product product)
  {
    return null;
  }

  @Override public String editProduct(Product product)
  {
    return null;
  }

  @Override public void removeProduct(Product product)
  {

  }
}
