package com.example.hw02.Controllers;

import com.example.hw02.model.Ingredient;
import com.example.hw02.services.IngredientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
 private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @GetMapping("/get")
    public Ingredient getIngredient(@RequestParam int id){
        return ingredientService.getIngredient(id);
    }
    @PutMapping("/put")
    public String putIngredient (@RequestBody Ingredient ingredient){
        return "Рецепт успешно добавлен (ID: " + ingredientService.putIngredient(ingredient) + ")";
    }



}
