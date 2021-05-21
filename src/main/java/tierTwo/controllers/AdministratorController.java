package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tierTwo.Services.administrator.AdministratorService;
import tierTwo.models.user.User;

@RestController
@RequestMapping("/admin")

public class AdministratorController
{
  @Autowired User userService;

  public ResponseEntity validateLogin(@RequestParam String username, @RequestParam String password)
  {
    User validateUser = new User();
    validateUser.setUserName(username);
    validateUser.setPassword(password);
  }
}
