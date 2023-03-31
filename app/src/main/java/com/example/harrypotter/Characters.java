package com.example.harrypotter;

public class Characters {

    private String name , image , dateOfBirth, gender, house, species, yearOfBirth, wizard,eyeColour, hairColour, patronus, actor, alive;

    public Characters(String name, String image, String dateOfBirth, String gender, String house, String species, String yearOfBirth, String wizard, String eyeColour, String hairColour, String patronus, String actor, String alive) {

        this.name = name;
        this.image = image;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.house = house;
        this.species = species;
        this.yearOfBirth = yearOfBirth;
        this.wizard = wizard;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        this.patronus = patronus;
        this.actor = actor;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getHouse() {
        return house;
    }

    public String getSpecies() {
        return species;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getWizard() {
        return wizard;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getPatronus() {
        return patronus;
    }

    public String getActor() {
        return actor;
    }

    public String getAlive() {
        return alive;
    }
}
