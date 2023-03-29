package com.example.harrypotter;

import com.google.gson.annotations.SerializedName;

public class Characters {
     @SerializedName("name")
    String name;
    @SerializedName("species")
     String species;
    @SerializedName("gender")
     String gender;
    @SerializedName("house")
     String house;
    @SerializedName("alternate_names")
     String alternate_name;
    @SerializedName("id")
    int id;
    @SerializedName("dateOfBirth")
     String dateOfBirth;
    @SerializedName("wizard")
     String wizard;
    @SerializedName("ancestry")
     String ancestry;
    @SerializedName("eyeColour")
     String eyeColour;
    @SerializedName("hairColour")
     String hairColour;
    @SerializedName("wand")
     String wand;
    @SerializedName("actor")
     String core;
    @SerializedName("alive")
     String wood;
    @SerializedName("image")
     String image;


    // Add more fields as necessary

    public Characters(String name, String species, String gender, String house, String alternate_name, int id, String dateOfBirth, String wizard, String ancestry, String eyeColour, String hairColour, String wand, String core, String wood, String image) {
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.house = house;
        this.alternate_name = alternate_name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.wizard = wizard;
        this.ancestry = ancestry;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        this.wand = wand;
        this.core = core;
        this.wood = wood;
        this.image = image;
    }


    // Constructor and getter/setter methods

    public String getName() {
        return name;
    }



    public String getSpecies() {
        return species;
    }



    public String getGender() {
        return gender;
    }



    public String getHouse() {
        return house;
    }


    public String getAlternate_name() {
        return alternate_name;
    }


    public int getId() {
        return id;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public String getWizard() {
        return wizard;
    }


    public String getAncestry() {
        return ancestry;
    }


    public String getEyeColour() {
        return eyeColour;
    }


    public String getHairColour() {
        return hairColour;
    }


    public String getWand() {
        return wand;
    }


    public String getCore() {
        return core;
    }


    public String getWood() {
        return wood;
    }


    public String getImage() {
        return image;
    }

}

