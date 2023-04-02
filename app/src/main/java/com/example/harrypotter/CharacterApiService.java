package com.example.harrypotter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CharacterApiService {
    @GET("api/characters")
    Call<List<Character>> getCharacters();

    @GET("api/characters")
    static Call<List<Characters>> searchCharacters(@Query("name") String name);
}

