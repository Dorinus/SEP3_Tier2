package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tierTwo.Services.bid.IBidService;
import tierTwo.models.product.Product;

import java.util.List;

@RestController public class BidController
{
  @Autowired IBidService bidService;

  @PostMapping("/bid/{productId}/{userId}")
  public boolean bid(@PathVariable int productId, @PathVariable int userId, @RequestBody int newPrice)
  {
    System.out.println("Setting new price for product: " + productId + "by user " + userId + " " + newPrice);
    return bidService.bid(productId, userId, newPrice);
  }

  @GetMapping("/bid/winner/{productId}")
  public String getBidWinner(@PathVariable int productId){
    System.out.println("Asking to get all active products");
    return bidService.getBidWinner(productId);
  }

  @GetMapping("/bid/{userId}")
  public List<Product> getUserBids(@PathVariable int userId){
    System.out.println("Asking to get all products user bids on or won the bid");
    return bidService.getUserBids(userId);
  }
}
