package tierTwo.controllers.websockets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tierTwo.models.User;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/manager")
@RequestMapping("/administrator")

public class UserController
{
   @Autowired
  UserController userController;

   @GetMapping("/manager")
  public @RequestBody List<User> getUsers(@RequestParam("limit") int limit, @RequestParam("skipped") int skipped)
   {
     System.out.println();
   }
}
