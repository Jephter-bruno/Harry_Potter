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
    List<Characters> characters;

    public CharactersAdapter(Context ctxs, List<Characters> characters) {
        this.characters = characters;
        this.ctxs = ctxs;
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
        public TextView gender;
        public TextView dateOfBirth;
        public TextView ancestry;
        public ImageView images;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            gender = itemView.findViewById(R.id.gender);
            ancestry = itemView.findViewById(R.id.ancestry);
            dateOfBirth = itemView.findViewById(R.id.dateOfBirth);
            images = itemView.findViewById(R.id.image);
        }

    }
}