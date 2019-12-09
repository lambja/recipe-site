package com.teamtreehouse.recipesite.recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    Recipe findById(Long id);
    void save(Recipe recipe);
    void delete(Recipe recipe);
}