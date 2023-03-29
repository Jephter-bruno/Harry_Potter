package com.example.harrypotter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIs {
    @GET("/characters")
    Call<List<Characters>> getCharacters();
}
