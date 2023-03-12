package com.example.hw02.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Recipe {

    private String name;
    private int cookingTime;
    private Ingredient [] ingredients;
//   private ArrayList<Ingredient> ingredientList;
    private ArrayList <String> steps;

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public ArrayList<Ingredient> getIngredientList() {
        return (ArrayList<Ingredient>) Arrays.asList(ingredients);
    }

/*    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }*/

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }


}
