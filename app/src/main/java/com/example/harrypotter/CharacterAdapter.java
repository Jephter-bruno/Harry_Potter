package com.example.harrypotter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.MovieHolder> {

    private Context context;
    private List<Characters> characterlist;

    public CharacterAdapter(Context context , List<Characters> characters){
        this.context = context;
        characterlist = characters;
    }
    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.character_item , parent , false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {

        Characters character = characterlist.get(position);
        holder.gender.setText(character.getGender());
        holder.name.setText(character.getName());
        holder.dateofBirth.setText(character.getDateOfBirth());
        Glide.with(context).load(character.getImage()).into(holder.image);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , DetailActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("name" , character.getName());
                bundle.putString("birth" , character.getDateOfBirth());
                bundle.putString("image" , character.getImage());
                bundle.putString("gender" , character.getGender());
                bundle.putString("house" , character.getHouse());


                intent.putExtras(bundle);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return characterlist.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView name , gender , dateofBirth, house;
        LinearLayout linearLayout;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            gender = itemView.findViewById(R.id.gender);
            dateofBirth = itemView.findViewById(R.id.dateofbirth);
            house = itemView.findViewById(R.id.ancestry);
            linearLayout = itemView.findViewById(R.id.main_layout);
        }
    }
}
