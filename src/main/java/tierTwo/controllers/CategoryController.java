package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tierTwo.Services.category.CategoryService;
import tierTwo.Services.category.ICategoryService;
import tierTwo.models.category.Category;
import tierTwo.models.user.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController
{
  @Autowired ICategoryService categoryService;

  @GetMapping("/category")
  public List<Category> getCategories(){
    System.out.println("Asking for all categories");

    return categoryService.getCategories();
  }
}
