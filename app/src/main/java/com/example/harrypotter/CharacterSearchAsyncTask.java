package com.example.harrypotter;

import android.content.Context;
import android.os.AsyncTask;

import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CharacterSearchAsyncTask extends AsyncTask<String, Void, List<Characters>> {

    private Context mContext;
    private RecyclerView mRecyclerView;
    private CharacterAdapter characterAdapters;

    public CharacterSearchAsyncTask(Context context, RecyclerView recyclerView, CharacterAdapter characterAdapters) {
        mContext = context;
        mRecyclerView = recyclerView;
        characterAdapters = characterAdapters;
    }

    @Override
    protected List<Characters> doInBackground(String... params) {
        String query = params[0];
        List<Characters> characters = new ArrayList<>();

        try {
            URL url = new URL("https://hp-api.onrender.com/api/characters" + query);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            StringBuilder response = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                response.append(line);
            }

            bufferedReader.close();
            inputStream.close();
            urlConnection.disconnect();

            // Parse the JSON response and create character objects
            JSONObject root = new JSONObject(response.toString());
            JSONArray items = root.getJSONArray("characters");
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);
                JSONObject CharacterInfo = item.getJSONObject("characterInfo");
                String name = CharacterInfo.getString("name");
                String gender = CharacterInfo.getString("gender");
                String image = CharacterInfo.getString("image");
                String date = CharacterInfo.getString("dateOfBirth");
                String house = CharacterInfo.getString("house");

                String species = CharacterInfo.getString("species");
                String year = CharacterInfo.getString("yearOfBirth");
                String wizard = CharacterInfo.getString("wizard");
                String eyecolour = CharacterInfo.getString("eyeColour");
                String haircolour = CharacterInfo.getString("hairColour");
                String patronus = CharacterInfo.getString("patronus");
                String actor = CharacterInfo.getString("actor");
                String alive = CharacterInfo.getString("alive");
                characters.add(new Characters(name , image ,
                        gender , date,house, species, year, wizard, eyecolour,haircolour,patronus,actor, alive));

            }
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }

        return characters;
    }

    @Override
    protected void onPostExecute(List<Characters> characters) {
        super.onPostExecute(characters);
        mRecyclerView.setAdapter(characterAdapters);
    }
}
