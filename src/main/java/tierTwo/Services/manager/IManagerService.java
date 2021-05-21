package tierTwo.Services.manager;

import org.springframework.stereotype.Service;
import tierTwo.models.bidding.Bidding;

@Service
public interface IManagerService
{
  String editBidding(Bidding bidding);
}
