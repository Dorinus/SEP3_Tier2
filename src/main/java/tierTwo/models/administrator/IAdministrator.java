package tierTwo.models.administrator;

import tierTwo.models.bidding.Bidding;
import tierTwo.models.user.User;

import java.util.List;

public interface IAdministrator
{
    List<User> getAllUsers(User user);
    List<User> addUser(User user);
    List<Bidding> getAllBiddings(Bidding bidding);
    void editBidding(Bidding bidding);
    void addBidding(Bidding bidding);
    void deleteBidding(Bidding bidding);
    void searchBiddings(Bidding bidding);
}
