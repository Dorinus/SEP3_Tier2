package group4.restservice.persistance;

import com.fasterxml.jackson.databind.ObjectMapper;
import group4.restservice.models.User;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerateFile
{


  public static void main(String[] args) throws JSONException
  {

    List<User> users = new ArrayList<>();

    User user = new User("admin", "admin",1);
    User user2= new User("manager", "manager",2);
    User user3 = new User("user", "user",3);

    users.add(user);
    users.add(user2);
    users.add(user3);


    //Writing to a file
    ObjectMapper mapper = new ObjectMapper();
    try {

      // Writing to a file
      mapper.writeValue(new File("users.json"), users );

    } catch (IOException e) {
      e.printStackTrace();
    }

    FileContext fileContext = new FileContext();

//    JSONObject obj = new JSONObject();
//    obj.put(user.getUsername(), user.getPassword());
//    obj.put(user2.getUsername(), user2.getPassword());
//    obj.put(user3.getUsername(), user3.getPassword());
  }
}
