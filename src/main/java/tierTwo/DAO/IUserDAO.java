package tierTwo.DAO;

import org.springframework.stereotype.Repository;
import tierTwo.models.user.User;

@Repository
public interface IUserDAO
{
  User validateUser(User user) throws Exception;
}
