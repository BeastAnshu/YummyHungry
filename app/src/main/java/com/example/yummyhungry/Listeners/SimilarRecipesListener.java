package com.example.yummyhungry.Listeners;

import com.example.yummyhungry.Models.SimilarRecipeResponse;

import java.util.List;

public interface SimilarRecipesListener {

    void didFetch(List<SimilarRecipeResponse> response, String message);
    void didError(String message);
}
