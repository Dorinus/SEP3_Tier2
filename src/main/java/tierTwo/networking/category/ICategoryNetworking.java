package tierTwo.networking.category;

import tierTwo.models.category.Category;

import java.util.List;

public interface ICategoryNetworking
{
  List<Category> getCategories();
  boolean createCategory(Category category);
  boolean removeCategory(String categoryName);
}
