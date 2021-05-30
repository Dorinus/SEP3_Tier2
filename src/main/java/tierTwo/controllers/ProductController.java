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
    System.out.println("Asking t o get all active products");

    // Todo call tier 3 and return all active products
    return null;
  }

  @GetMapping("/product/{productId}")
  public Product getProduct(@PathVariable int productId){
    System.out.println("Asking to get all active products");

    // Todo call tier 3 and return product with this id
    return null;
  }


  @DeleteMapping("/product/{productId}")
  public boolean removeProduct(@PathVariable int productId){
    System.out.println("Asking to get a bool for delete confirmation");


    // Todo call tier 3 and return true if product is deleted
    return true;
  }

  @PutMapping("/product/{productId}")
  public boolean editProduct(@RequestBody int id){
    System.out.println("Asking to get a bool for edit confirmation");


    // Todo call tier 3 and return true if product is edited
    return true;
  }


}
