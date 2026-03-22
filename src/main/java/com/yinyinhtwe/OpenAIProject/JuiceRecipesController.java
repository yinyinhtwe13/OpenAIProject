package com.yinyinhtwe.OpenAIProject;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/juice-recipes")
public class JuiceRecipesController {


    private final JuiceRecipesService juiceRecipesService;

    public JuiceRecipesController( JuiceRecipesService juiceRecipesService) {
        this.juiceRecipesService = juiceRecipesService;
    }
    @GetMapping
    public List<JuiceRecipes >getRecipe(){
        return juiceRecipesService.getAllJuiceRecipe();
    }
    @GetMapping("{id}")
    public JuiceRecipes getRecipeById(@PathVariable Integer id){
        return juiceRecipesService.getAllJuiceRecipeById(id);
    }



   @PostMapping
   public void addNewJuiceRecipe(@RequestBody JuiceRecipes juiceRecipes){
        juiceRecipesService.insertJuiceRecipe(juiceRecipes);
   }

}
