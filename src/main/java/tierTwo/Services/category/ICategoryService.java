package tierTwo.Services.category;

import tierTwo.models.category.Category;

import java.util.List;

public interface ICategoryService
{
  List<Category> getCategories(String categoryName);
}
