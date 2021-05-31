package tierTwo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

  @PostMapping("/category")
  public boolean createCategory(@RequestBody Category category){
    System.out.println("Adding new category " + category);
    return categoryService.createCategory(category);
  }

  @DeleteMapping("/category/{categoryName}")
  public boolean removeCategory(@PathVariable String categoryName){
    System.out.println("Delete category " + categoryName);
    return categoryService.removeCategory(categoryName);
  }
}
