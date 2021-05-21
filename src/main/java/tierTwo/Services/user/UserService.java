package tierTwo.Services.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import tierTwo.Services.user.IUserServices;
import tierTwo.models.user.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class UserService implements IUserServices
{

  @Override public User validateUser(User user) throws Exception
  {
    return null;
  }
}
