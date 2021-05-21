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
}
