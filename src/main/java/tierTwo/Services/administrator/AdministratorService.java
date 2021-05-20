package tierTwo.Services.administrator;

import org.springframework.beans.factory.annotation.Autowired;
import tierTwo.networking.administrator.AdminSocket;

public class AdministratorService implements IAdministratorService
{
  @Autowired AdminSocket adminSocket;

}
