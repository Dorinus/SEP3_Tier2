package tierTwo.Services.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tierTwo.Services.user.IUserServices;
import tierTwo.models.user.User;
import tierTwo.networking.user.UserNetworking;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class UserService implements IUserServices
{
  @Autowired UserNetworking userNetworking;

  public UserService(UserNetworking userNetworking)
  {
    this.userNetworking = userNetworking;
  }

  @Override public User validateUser(User user)
  {
    return userNetworking.validateUser(user);
  }
}
