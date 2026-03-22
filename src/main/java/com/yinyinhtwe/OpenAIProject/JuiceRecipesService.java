package com.yinyinhtwe.OpenAIProject;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuiceRecipesService {
    private final JuiceRecipesRepository juiceRecipesRepository;

    public JuiceRecipesService(JuiceRecipesRepository juiceRecipesRepository) {
        this.juiceRecipesRepository = juiceRecipesRepository;
    }

    public List<JuiceRecipes>getAllJuiceRecipe(){
        return juiceRecipesRepository.findAll();
    }

    public void insertJuiceRecipe(JuiceRecipes juiceRecipes) {
        juiceRecipesRepository.save(juiceRecipes);
    }


    public JuiceRecipes getAllJuiceRecipeById(Integer id) {
    return juiceRecipesRepository.findById(id)
            .orElseThrow(() ->new IllegalStateException(
                    id+" not found"
            ));
    }
}
