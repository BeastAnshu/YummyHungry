package com.example.yummyhungry.Listeners;

import com.example.yummyhungry.Models.RecipeDetailsResponse;

public interface RecipeDetailsListener {
    void didFetch(RecipeDetailsResponse response,String message);
    void didError(String message);
}
