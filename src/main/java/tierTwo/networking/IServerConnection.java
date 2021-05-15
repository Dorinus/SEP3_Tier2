package tierTwo.networking;

import tierTwo.models.ActualRequest;

public interface IServerConnection
{
  ActualRequest requestToServer(ActualRequest actualRequest);
}
