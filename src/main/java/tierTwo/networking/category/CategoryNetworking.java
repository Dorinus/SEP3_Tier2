package tierTwo.networking.category;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tierTwo.models.category.Category;
import tierTwo.models.user.User;
import tierTwo.networking.communication.SocketClient;
import tierTwo.networking.network.NetworkRequest;
import tierTwo.networking.network.NetworkType;

import java.util.List;

@Component
public class CategoryNetworking implements ICategoryNetworking
{
  @Autowired SocketClient socketClient;

  @Override public List<Category> getCategories(String categoryName)
  {
    Gson gson = new Gson();
    NetworkRequest networkRequest= new NetworkRequest(NetworkType.GETCATEGORIES, String.valueOf(categoryName));
    String input = socketClient.communicate(networkRequest);
    return gson.fromJson(input, new TypeToken<List<User>>(){}.getType());
  }
}
