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

  @PostMapping("/category/{categoryName}")
  public boolean CreateCategory(@PathVariable String categoryName){
    System.out.println("Adding new category " + categoryName);

    //ToDo add category and get responsse
    return true;
  }

  @DeleteMapping("/category/{categoryName}")
  public boolean removeProduct(@PathVariable String categoryName){
    System.out.println("Deletene category " + categoryName);
    //ToDo delete category and get responsse
    return true;
  }
}
