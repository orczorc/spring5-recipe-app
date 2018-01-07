package de.birefringence.spring5recipeapp.Controllers;

import de.birefringence.spring5recipeapp.domain.Category;
import de.birefringence.spring5recipeapp.domain.UnitOfMeasure;
import de.birefringence.spring5recipeapp.repositories.CategoryRepository;
import de.birefringence.spring5recipeapp.repositories.UnitOfMeasureRepository;
import de.birefringence.spring5recipeapp.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {

    //private CategoryRepository categoryRepository;
    //private UnitOfMeasureRepository unitOfMeasureRepository;

    //public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
    //    this.categoryRepository = categoryRepository;
    //    this.unitOfMeasureRepository = unitOfMeasureRepository;
    //}

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

       /* Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat ID is: " + categoryOptional.get().getId());
        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());
        */

       log.debug("Inside the Controller class.");
       model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
