package com.teamtreehouse.recipesite.recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> searchAndFilter(String category, String searchTerm);
    List<Recipe> findAll();
    Recipe findById(Long id);
    Recipe save(Recipe recipe);
    void delete(Recipe recipe);
    void clearFavorites(Recipe recipe);
}
