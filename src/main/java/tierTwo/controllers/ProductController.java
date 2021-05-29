package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tierTwo.Services.product.IProductService;
import tierTwo.models.product.Product;

import java.util.List;

@RestController
public class ProductController
{

  @Autowired IProductService productService;

  @PostMapping("/product") public int addProduct(@RequestBody Product product)
  {
    System.out.println("Creating product " + product.getName());
    //call tier3 and get the response
    return productService.addProduct(product);
  }

  @GetMapping("/product/{id}") public List<Product> getUsers(@PathVariable int id)
  {

    System.out.println("Asking for product: " + id);
    return productService.getProduct(id);
  }

  @GetMapping("/edit") public String editProduct(@RequestBody Product product)
  {
    return productService.editProduct(product);
  }

  @DeleteMapping("/delete/{id}") public void removeProduct(@PathVariable int id)
  {
    productService.removeProduct(id);
  }
}


