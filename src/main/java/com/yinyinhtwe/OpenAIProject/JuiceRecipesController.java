package com.yinyinhtwe.OpenAIProject;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/juice-recipes")
public class JuiceRecipesController {

    private final List<JuiceRecipes> recipes=new ArrayList<>(
         List.of(
                new JuiceRecipes(
                     1,
                     "Breakfast Smoothie",
                     "Banana,Strawberries,Apple Juice,Runny honey"
                ),
                new JuiceRecipes(
                        2,
                        "Ginger Shots",
                        "Ginger,Apple juice,Lemon"
                ),
                new JuiceRecipes(
                        3,
                        "Kale Smoothie",
                        "Kale,Avocado,Lime,Frozen pineapple chunks,Ginger,Nuts,Banana"
                ),
                new JuiceRecipes(
                        4,
                        "Celery Juice",
                        "Celery,Green apple,Lemon,Ginger"
                ),
                new JuiceRecipes(5,
                        "Mulled Apple Juice",
                        "Apple juice,Orange peel,Cinnamon stick,Cloves,Sugar"
                )

        )


    );

    @GetMapping
    public List<JuiceRecipes>getRecipe(){
        return recipes;
    }

    @PostMapping
    public void addRecipe(@RequestBody JuiceRecipes recipe){
        recipes.add(recipe);
    }

    @PutMapping("/{id}")
    public void updateRecipe(
            @PathVariable int id,
            @RequestBody JuiceRecipes updateRecipe
    ){
        for (JuiceRecipes recipe:recipes){
            if (recipe.getId()==id){
                recipe.setName(updateRecipe.getName());
                recipe.setIngredient(updateRecipe.getIngredient());
                break;
            }
        }
    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable int id){
     recipes.removeIf(recipes -> recipes.getId()==id);
    }
}
