package com.example.hw02.services;

import com.example.hw02.model.Recipe;

public interface RecipeService {
    int putRecipe (Recipe recipe);

    Recipe getRecipe (int id);
}
