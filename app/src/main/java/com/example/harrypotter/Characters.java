package com.example.harrypotter;

public class Characters {
    private String name;
    private String species;
    private String gender;
    private String house;
    private String alternate_name;
    private String id;
    private String dateOfBirth;
    private String wizard;
    private String ancestry;
    private String eyeColour;
    private String hairColour;
    private String wand;
    private String core;
    private String wood;
    private String image;

    // Add more fields as necessary

    public Characters(String name, String species, String gender, String house, String alternate_name, String id, String dateOfBirth, String wizard, String ancestry, String eyeColour, String hairColour, String wand, String core, String wood, String image) {
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

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAlternate_name() {
        return alternate_name;
    }

    public void setAlternate_name(String alternate_name) {
        this.alternate_name = alternate_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWizard() {
        return wizard;
    }

    public void setWizard(String wizard) {
        this.wizard = wizard;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getWand() {
        return wand;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

