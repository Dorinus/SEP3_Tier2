package group4.restservice.controllers;

import group4.restservice.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

  @GetMapping("/user")
  public User user(){
    //we can write our logic
    return  new User("admin", "admin", 101);
  }
}
