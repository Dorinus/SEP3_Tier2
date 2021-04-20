package group4.restservice.persistance;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import group4.restservice.models.User;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;




public class FileContext
{
  private List<User> users;

  public FileContext()
  {
    users = new ArrayList<User>();

    try{
//      ObjectMapper mapper = new ObjectMapper();
//      InputStream is = Test.class.getResourceAsStream("users.json");
//      users = mapper.readValue(is, Test.class);
      ObjectMapper objectMapper = new ObjectMapper();

      InputStream input = new FileInputStream("users.json");

      users = objectMapper.readValue(input, new TypeReference<List<User>>(){});


    } catch (Exception e){
      System.out.println(e);
    }

    for (User user : users)
    {
      System.out.println(user.getUsername());
    }

  }






}
