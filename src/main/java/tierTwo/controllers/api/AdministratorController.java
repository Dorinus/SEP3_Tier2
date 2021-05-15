package tierTwo.controllers.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tierTwo.Services.AdministratorService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/")

public class AdministratorController
{
  @Autowired AdministratorService adminService;
}
