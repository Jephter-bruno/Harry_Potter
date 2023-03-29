package com.example.harrypotter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
CharactersAdapter charactersAdapter;
List<Characters> characters = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setAdapter(charactersAdapter);
         getCharacters();

    }

    private void getCharacters() {
        RetrofitClient.getRetrofitClient().getCharacters().enqueue(new Callback<List<Characters>>() {
            @Override
            public void onResponse(Call<List<Characters>> call, Response<List<Characters>> response) {
                 if(response.isSuccessful()&& response.body() != null){
                     List<Characters> characters = response.body();
                     characters.addAll(response.body());
                    charactersAdapter.notifyDataSetChanged();
                     Toast.makeText(MainActivity.this, "Characters Found", Toast.LENGTH_SHORT).show();

                 }
            }

            @Override
            public void onFailure(Call<List<Characters>> call, Throwable t) {

            }
        });
    }

}