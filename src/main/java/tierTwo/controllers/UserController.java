package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tierTwo.Services.user.UserService;
import tierTwo.models.user.User;

@RestController
public class UserController
{
 @Autowired UserService userService;

   @GetMapping("/login")
  public User validateUser(User user){

     //call tier3 and get the response
   return userService.validateUser(user);

   }

}
