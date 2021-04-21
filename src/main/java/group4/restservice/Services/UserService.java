package group4.restservice.Services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import group4.restservice.models.User;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// should be made singleton?
public class UserService implements IUserServices
{

  public static final String POSTS_API_URL =  "http://localhost:5002/user";

  @Override public User getUser() throws IOException, InterruptedException
  {

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().GET().header("accept", "application/json").uri(URI.create(POSTS_API_URL)).build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    // parse JSON
    ObjectMapper mapper = new ObjectMapper();
    User user = mapper.readValue(response.body(), new TypeReference<User>() {});


    System.out.println("Hooooooooooooooo");

    System.out.println(user.getUserName());
    return user;

  }





}
