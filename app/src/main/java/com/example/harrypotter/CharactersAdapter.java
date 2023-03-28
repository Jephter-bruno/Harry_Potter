package com.example.harrypotter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CharactersAdapter extends RecyclerView.Adapter<CharactersAdapter.ViewHolder> {
    Context ctxs;
    private List<Characters> characters;

    public CharactersAdapter(List<Characters> characters) {
        this.characters = characters;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctxs)
                .inflate(R.layout.character_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Characters character = characters.get(position);
        holder.name.setText(character.getName());
        holder.dateOfBirth.setText(character.getSpecies());
        holder.ancestry.setText(character.getHouse());
        Glide.with(ctxs).load(character.getImage()).into(holder.images);
        holder.gender.setText(character.getHouse());


    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView alternate_name;
        public TextView species;
        public Context ctxs;
        public TextView gender;
        public TextView house;
        public TextView dateOfBirth;
        public TextView wizard;
        public TextView ancestry;
        public TextView eyeColour;
        public TextView hairColour;
        public TextView wand;
        public TextView wood;
        public ImageView images;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            gender = itemView.findViewById(R.id.gender);
            ancestry = itemView.findViewById(R.id.ancestry);
            dateOfBirth = itemView.findViewById(R.id.dateOfBirth);
            images = itemView.findViewById(R.id.image);
        }
        public void setImage(Context ctxs,String image) {
            Glide.with(ctxs).load(image).into(images);

        }

    }
}