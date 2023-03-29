package com.example.harrypotter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class RetrofitClient {
   private static Retrofit retrofit = null;
    private static final String BASE_URL ="https://hp-api.onrender.com/api/";

   public static APIs getRetrofitClient(){
       if(retrofit == null){
           retrofit = new Retrofit.Builder()
                   .baseUrl(BASE_URL)
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return retrofit.create(APIs.class);
   }
}

