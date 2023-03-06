package com.example.hw02.Controllers;

import com.example.hw02.model.Recipe;
import com.example.hw02.services.IngredientService;
import com.example.hw02.services.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
 private RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @GetMapping("/get")
    public Recipe getRecipe(@RequestParam int id){
        return recipeService.getRecipe(id);
    }
    @PutMapping("/put")
    public String putRecipe (@RequestBody Recipe recipe){
        return "Рецепт успешно добавлен (ID: " + recipeService.putRecipe(recipe) + ")";
    }



}
