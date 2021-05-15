package tierTwo.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tierTwo.models.user.User;

import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping({"/manager", "/administrator"})

public class UserController
{
   @Autowired
  UserController userController;

   @GetMapping("/manager")
  public @ResponseBody List<User> getUsers(@RequestParam("limit") int limit, @RequestParam("skipped") int skipped)
   {

   }
}
