package tierTwo.models.user;

public interface IUser
{
  String getUserName();
  String getPassword();
  String getType();
  PersonalInfo getPersonalInfo();
  int getId();
}
