package tierTwo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Request
{
  private String str;
  private Object object;

  public Request(String str)
  {
    this.str = str;
    object = null;
  }

  public String getStr()
  {
    return str;
  }

  public void setStr(String str)
  {
    this.str = str;
  }

  public Object getObject()
  {
    return object;
  }

  public void setObject(Object object)
  {
    this.object = object;
  }
}
