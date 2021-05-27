package tierTwo.Services.category;

import org.springframework.beans.factory.annotation.Autowired;
import tierTwo.models.category.Category;
import tierTwo.networking.category.CategoryNetworking;
import tierTwo.networking.user.UserNetworking;

import java.util.List;

public class CategoryService implements ICategoryService
{
  @Autowired CategoryNetworking categoryNetworking;

  @Override public List<Category> getCategories()
  {
    return categoryNetworking.getCategories();
  }
}
