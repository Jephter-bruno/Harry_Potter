package com.example.harrypotter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HarryPotterApiService {
    @GET("api/characters")
    Call<List<Characters>> getCharacters();
}

