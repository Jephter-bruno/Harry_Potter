package com.example.harrypotter;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ImageView imageView = findViewById(R.id.image1);
        TextView name = findViewById(R.id.name);
        TextView house = findViewById(R.id.house);
        TextView gender = findViewById(R.id.gender);
        TextView date = findViewById(R.id.dateOfBirth);

        TextView species = findViewById(R.id.spieces);
        TextView yearof = findViewById(R.id.alternate_name);
        TextView wizard = findViewById(R.id.wizard);
        TextView eyecolour = findViewById(R.id.eyeColour);
        TextView haircolour = findViewById(R.id.hairColour);
        TextView patronus = findViewById(R.id.wand);
        TextView actor = findViewById(R.id.core);
        TextView alive = findViewById(R.id.wood);


        Bundle bundle = getIntent().getExtras();
        String mname = bundle.getString("name");
        String mimage = bundle.getString("image");
        String mhouse = bundle.getString("house");
        String mgender = bundle.getString("gender");
        String mdate = bundle.getString("birth");

        String mspecies = bundle.getString("species");
        String myear = bundle.getString("yearOfBirth");
        String mwizard = bundle.getString("wizard");
        String meyecolour = bundle.getString("eyeColour");
        String mhaiircolour = bundle.getString("hairColour");
        String mpatronus = bundle.getString("patronus");
        String mactor = bundle.getString("actor");
        String alives = bundle.getString("alive");

        Glide.with(this).load(mimage).into(imageView);
        name.setText(mname);
        house.setText(mhouse);
        gender.setText(mgender);
        date.setText(mdate);
        species.setText(mspecies);
        yearof.setText(myear);
        wizard.setText(mwizard);
        eyecolour.setText(meyecolour);
        haircolour.setText(mhaiircolour);
        patronus.setText(mpatronus);
        actor.setText(mactor);
        alive.setText(alives);


    }
}