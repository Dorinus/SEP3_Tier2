package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tierTwo.models.user.User;

@RestController
public class UserController
{


   @GetMapping("/login")
  public User validateUser(User user){

     //call tier3 and get the response

     User user1 = new User();
     user1.setUserName("admin");
     user1.setUserName("admin");
     user1.setType("admin");

     return user1;
   }

}
