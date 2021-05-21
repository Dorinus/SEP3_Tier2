package tierTwo.models;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Request
{
  private String str;
  private Object object;

  public Request(String str, Object object)
  {
    this.str = str;
    this.object = object;
  }
}
