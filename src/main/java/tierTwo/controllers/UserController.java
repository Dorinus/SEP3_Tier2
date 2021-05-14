package tierTwo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController public class UserController implements IUserController
{

  public UserController()
  {

  }


  // ignore this
  @GetMapping("/user") public User user()
  {
    return  null;
  }


  // User registartion
  @PostMapping("/user") public boolean registerUser(@RequestBody User user)
  {
        return  true;
  }

}
