package com.example.hw02.services;

import com.example.hw02.model.Ingredient;
import com.example.hw02.model.Recipe;

import java.util.ArrayList;
import java.util.Map;

public interface IngredientService {
    int addIngredient (Ingredient ingredient);

    boolean removeIngredient(int id);

    boolean editIngredient(int id, Ingredient ingredient);

    String infoIngredient(int id);

    ArrayList<Ingredient> getAllIngredient ();

    Ingredient getIngredientById(int id);
}
