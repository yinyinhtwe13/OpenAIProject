package com.yinyinhtwe.OpenAIProject;

import java.util.Objects;


public class JuiceRecipes {
    private int id;
    private String name;
    private String ingredient;

    public JuiceRecipes(int id, String name, String ingredient) {
        this.id = id;
        this.name = name;
        this.ingredient = ingredient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        JuiceRecipes that = (JuiceRecipes) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ingredient);
    }


    public void add(JuiceRecipes recipes) {
    }
}
