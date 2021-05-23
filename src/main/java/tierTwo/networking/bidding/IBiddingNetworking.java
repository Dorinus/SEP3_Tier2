package tierTwo.networking.bidding;

import tierTwo.models.bidding.Bidding;

import java.util.List;

public interface IBiddingNetworking
{
  void addBidding(Bidding bidding);
  void editBidding(Bidding bidding);
  void deleteBidding(int id);
  List<Bidding> getBiddingById(int id);
}
