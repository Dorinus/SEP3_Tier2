package tierTwo.networking.communication;

import tierTwo.networking.network.NetworkRequest;

public interface SocketClient
{
  void startClient();

  String communicate(NetworkRequest networkRequest);

}
