package tierTwo.networking.network;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkRequest
{
  @JsonProperty private NetworkType networkType;
  @JsonProperty private String content;

  public NetworkRequest(NetworkType networkType, String content)
  {
    this.networkType = networkType;
    this.content = content;
  }

  public NetworkType getNetworkType()
  {
    return networkType;
  }

  public String getContent()
  {
    return content;
  }

  @Override public String toString()
  {
    return "NetworkRequest{" + "networkType=" + networkType + ", content='"
        + content + '\'' + '}';
  }
}
