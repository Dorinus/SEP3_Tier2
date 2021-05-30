package tierTwo.controllers;

import org.springframework.web.bind.annotation.*;
import tierTwo.models.product.Product;

import java.util.List;

@RestController public class BidController
{
  @PostMapping("/bid/{productId}")
  public boolean bid(@PathVariable int productId , @RequestBody int newPrice)
  {
    System.out.println("Setting new price for product: " + productId + " " + newPrice);

    //ToDo add new price to product

    return true;
  }

  @GetMapping("/product/winner/{productId}")
  public String getBidWinner(@PathVariable int productId){
    System.out.println("Asking to get all active products");
    //ToDo get bid winner
    return null;
  }

  @GetMapping("/product/{userId}")
  public List<Product> getUserBids(@PathVariable int userId){
    System.out.println("Asking to get all products user bids on or won the bid");
    //ToDo get product user bid on
    return null;
  }





}
