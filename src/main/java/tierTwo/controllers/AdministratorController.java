package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tierTwo.Services.administrator.AdministratorService;


@RestController
@RequestMapping("/admin")

public class AdministratorController
{
  @Autowired AdministratorService adminService;
}
