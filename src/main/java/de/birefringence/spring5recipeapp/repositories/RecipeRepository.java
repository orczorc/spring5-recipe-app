package de.birefringence.spring5recipeapp.repositories;

import de.birefringence.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
