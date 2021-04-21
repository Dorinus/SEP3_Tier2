package group4.restservice.controllers;

import group4.restservice.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController public class UserController
{

  public UserController()
  {

  }

  @GetMapping("/user") public User user()
  {


    User user =   new User("TestTier2","TestPassTier2",305);
    return  user;

  }

}
