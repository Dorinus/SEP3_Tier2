package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tierTwo.Services.bid.IBidService;
import tierTwo.models.product.Product;

import java.util.List;

@RestController public class BidController
{
  @Autowired IBidService bidService;

  @PostMapping("/bid/{productId}")
  public boolean bid(@PathVariable int productId , @RequestBody int newPrice)
  {
    System.out.println("Setting new price for product: " + productId + " " + newPrice);
    return bidService.bid(productId, newPrice);
  }

  @GetMapping("/product/winner/{productId}")
  public String getBidWinner(@PathVariable int productId){
    System.out.println("Asking to get all active products");
    return bidService.getBidWinner(productId);
  }

  @GetMapping("/product/{userId}")
  public List<Product> getUserBids(@PathVariable int userId){
    System.out.println("Asking to get all products user bids on or won the bid");
    return bidService.getUserBids(userId);
  }





}
