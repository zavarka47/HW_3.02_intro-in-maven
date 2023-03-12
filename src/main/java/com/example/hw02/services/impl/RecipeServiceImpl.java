package com.example.hw02.services.impl;

import com.example.hw02.model.Ingredient;
import com.example.hw02.model.Recipe;
import com.example.hw02.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final Map<Integer, Recipe> recipeMap = new HashMap<>();
    IngredientServiceImpl ingredientService = new IngredientServiceImpl();


    private int countId = 1;

    @Override
    public int addRecipe(Recipe recipe) {
        int id = countId++;
        recipeMap.put(id, recipe);

/*        for (Ingredient ingredient : recipe.getIngredientList()) {
            ingredientService.addIngredient(ingredient);
        }*/

        return id;
    }
    @Override
    public boolean editeRecipe(int id, Recipe recipe){
        if (recipeMap.containsKey(id)){
            recipeMap.put(id, recipe);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean removeRecipe(int id){
        if (recipeMap.containsKey(id)){
            recipeMap.remove(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Recipe getRecipe (int id) {
        return recipeMap.get(id);
    }
    @Override
    public ArrayList<Recipe> getAllRecipe(){
        return new ArrayList<>(recipeMap.values());
    }

    @Override
    public ArrayList<Recipe> getRecipeById(int id){
        ArrayList <Recipe> recipeListById = new ArrayList<>();
        for (Recipe recipe : recipeMap.values()) {
            for (Ingredient ingredient:recipe.getIngredientList()) {
                if (ingredient.equals(ingredientService.getIngredientById(id))){
                    recipeListById.add(recipe);
                }
            }
        }
        return recipeListById;
    }

    @Override
    public ArrayList<Recipe> getRecipeByIngredients (int[] idIngredient){
        List<Ingredient> byIngredients = new ArrayList<>();
        for (Integer id : idIngredient) {
            byIngredients.add(ingredientService.getIngredientById(id));}
        ArrayList<Recipe> recipesListByIngredients = new ArrayList<>();
        for (Recipe recipe:recipeMap.values()) {
            if (recipe.getIngredientList().containsAll(byIngredients)){
                recipesListByIngredients.add(recipe);
            }
        }
        return recipesListByIngredients;
    }


    
}
