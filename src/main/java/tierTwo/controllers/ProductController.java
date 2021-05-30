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

  @PostMapping("/product")
  public int createProduct(@RequestBody Product product){
    System.out.println("Creating product " + product.getName());
    //call tier3 and get the response
    return productService.addProduct(product);
  }

  @GetMapping("/activeProducts/{pageNumber}")
  public List<Product> getActiveProducts(@PathVariable int pageNumber){
    System.out.println("Asking to get all active products");

    // Todo call tier 3 and return all active products
    return null;
  }

  @GetMapping("/product/{productId}")
  public Product getProduct(@PathVariable int productId){
    System.out.println("Asking to get all active products");

    return productService.getProduct(productId);
  }


  @DeleteMapping("/product/{productId}")
  public boolean removeProduct(@PathVariable int productId){
    System.out.println("Asking to get a bool for delete confirmation");
    return productService.removeProduct(productId);
  }

  @PutMapping("/product/{productId}")
  public boolean editProduct(@RequestBody Product editedProduct){
    System.out.println("Asking to get a bool for edit confirmation");

    return productService.editProduct(editedProduct);
  }


}
