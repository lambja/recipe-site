package com.teamtreehouse.recipesite.user;

import com.teamtreehouse.recipesite.recipe.Recipe;

import java.util.List;

public interface UserService {
    User findByUsername(String username);
    void save(User user);
    void toggleFavorite(User user, Recipe recipe);
}
