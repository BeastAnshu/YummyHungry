package com.example.yummyhungry.Listeners;

import com.example.yummyhungry.Models.RandomRecipeApiResponse;

public interface RandomRecipeResponseListener {
    void didFetch (RandomRecipeApiResponse response, String message);
    void didError(String message);
}
