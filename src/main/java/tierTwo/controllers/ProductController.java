package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tierTwo.Services.product.IProductService;
import tierTwo.Services.user.IUserServices;
import tierTwo.models.product.Product;
import tierTwo.models.user.User;

@RestController
public class ProductController
{

  @Autowired IProductService productService;

  @PostMapping("/product")
  public int addProduct(@RequestBody Product product){
    System.out.println("Creating product " + product.getName());
    //call tier3 and get the response
    return productService.addProduct(product);
  }
}
