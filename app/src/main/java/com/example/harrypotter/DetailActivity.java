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


        ImageView imageView = findViewById(R.id.image);
        TextView name = findViewById(R.id.name);
        TextView house = findViewById(R.id.house);
        TextView gender = findViewById(R.id.gender);
        TextView date = findViewById(R.id.dateOfBirth);


        Bundle bundle = getIntent().getExtras();
        String mname = bundle.getString("name");
        String mimage = bundle.getString("image");
        String mhouse = bundle.getString("house");
        String mgender = bundle.getString("gender");
        String mdate = bundle.getString("birth");

        Glide.with(this).load(mimage).into(imageView);
        name.setText(mname);
        house.setText(mhouse);
        gender.setText(mgender);
        date.setText(mdate);

    }
}