package com.example.hw02.services;

import com.example.hw02.model.Ingredient;

public interface IngredientService {
    int putIngredient (Ingredient ingredient);

    Ingredient getIngredient (int id);
}
