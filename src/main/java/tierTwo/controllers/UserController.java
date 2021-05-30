package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tierTwo.Services.user.IUserServices;
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
     User user1 = userService.validateUser(user);
     if(user1==null){
       System.out.println("user is null");
     }
   return user1;

   }


   @GetMapping("/users/{pageNumber}")
  public List<User> getUsers(@PathVariable int pageNumber){

     System.out.println("Asking for page with user nr: " + pageNumber);
     return userService.getUsers(pageNumber);


//     List<User> users = userService.getUsers(pageNumber);
//     for (User u0 : users)
//     {
//       System.out.println(u0.getUsername());
//     }
//
//     return users;
  }

}
