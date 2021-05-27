package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tierTwo.Services.user.IUserServices;
import tierTwo.Services.user.UserService;
import tierTwo.models.user.User;

import java.util.List;

@RestController
public class UserController
{
 @Autowired IUserServices userService;

   @PostMapping("/login")
  public User validateUser(@RequestBody User user){
     System.out.println("Logging in user " + user);
     //call tier3 and get the response
   return userService.validateUser(user);
   }

   @GetMapping("/users/{pageNumber}")
  public List<User> getUsers(@PathVariable int pageNumber){
     System.out.println("Asking for page with user nr: " + pageNumber);
     return null;
   }

}
