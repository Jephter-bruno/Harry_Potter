package com.example.harrypotter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RequestQueue requestQueue;
    private List<Characters> charactersList;
    private EditText mSearchEditText;
    private Button button;
    private RecyclerView mRecyclerView;
    private CharacterAdapter mBookAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        button = findViewById(R.id.searchbutton);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        requestQueue = VolleySingleton.getmInstance(this).getRequestQueue();

        charactersList = new ArrayList<>();
        fetchCharacters();
        mSearchEditText = findViewById(R.id.searchView);
        String query =  mSearchEditText.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<List<Characters>> call = CharacterApiService.searchCharacters(query);
                call.enqueue(new Callback<List<Characters>>() {

                    @Override
                    public void onResponse(Call<List<Characters>> call, retrofit2.Response<List<Characters>> response) {
                        if (response.isSuccessful()) {
                            List<Characters> characters = response.body();
                            characters.clear();
                            characters.addAll(response.body());
                            mBookAdapter.notifyDataSetChanged();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Characters>> call, Throwable t) {

                    }
                });

            }
        });
            }

            private void fetchCharacters() {

                String url = "https://hp-api.onrender.com/api/characters";

                JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jsonObject = response.getJSONObject(i);
                                String name = jsonObject.getString("name");
                                String gender = jsonObject.getString("gender");
                                String image = jsonObject.getString("image");
                                String date = jsonObject.getString("dateOfBirth");
                                String house = jsonObject.getString("house");

                                String species = jsonObject.getString("species");
                                String year = jsonObject.getString("yearOfBirth");
                                String wizard = jsonObject.getString("wizard");
                                String eyecolour = jsonObject.getString("eyeColour");
                                String haircolour = jsonObject.getString("hairColour");
                                String patronus = jsonObject.getString("patronus");
                                String actor = jsonObject.getString("actor");
                                String alive = jsonObject.getString("alive");

                                Characters characterrs = new Characters(name, image,
                                        gender, date, house, species, year, wizard, eyecolour, haircolour, patronus, actor, alive);
                                charactersList.add(characterrs);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                            CharacterAdapter adapter = new CharacterAdapter(MainActivity.this, charactersList);

                            recyclerView.setAdapter(adapter);
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });

                requestQueue.add(jsonArrayRequest);
            }
        }