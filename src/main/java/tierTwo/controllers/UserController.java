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
  }

  @DeleteMapping("/users/{userId}")
  public boolean removeUser(@PathVariable int userId){
    System.out.println("Asking to get a bool for delete confirmation");
    return userService.removeUser(userId);
  }

  @PutMapping("/users/{userId}")
  public boolean editUser(@RequestBody User editedUser){
    System.out.println("Asking to get a bool for edit confirmation");
    return userService.editUser(editedUser);
  }

  @PutMapping("/users/type")
  public String changeUserType(@RequestBody int userId){
    System.out.println("Asking to get a bool for edit confirmation");
    return userService.changeType(userId);
  }

}
