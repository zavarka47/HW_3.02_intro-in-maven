package com.example.hw02.Controllers;

import com.example.hw02.model.Recipe;
import com.example.hw02.services.RecipeService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
 private final RecipeService recipeService;
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping("/add")
    public String addRecipe (@RequestBody Recipe recipe){
        return "Рецепт успешно добавлен (ID: " + recipeService.addRecipe(recipe) + ")";
    }
    @PutMapping("/edit/{id}")
    public boolean editRecipe (@PathVariable("id") int id, @RequestBody Recipe recipe){
        return recipeService.editeRecipe(id, recipe);
    }
    @DeleteMapping("/remove/{id}")
    public boolean removeRecipe (@PathVariable("id") int id, @RequestBody Recipe recipe){
        return recipeService.editeRecipe(id, recipe);
    }
    @GetMapping("/get/byId/{id}")
    public Recipe getRecipe(@PathVariable int id){
            return recipeService.getRecipe(id);

    }
        @GetMapping("/get/all")
    public ArrayList<Recipe> getAllRecipe(){
        return recipeService.getAllRecipe();
    }
    @GetMapping("/get/byIngredient/{ids}")
    public ArrayList<Recipe> getRecipeByIngredient(@PathVariable("ids") int... ids){
       return recipeService.getRecipeByIngredients(ids);
    }

}
