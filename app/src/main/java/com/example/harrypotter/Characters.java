package com.example.harrypotter;

public class Characters {

    private String name , image , dateOfBirth;
    private String gender, house;

    public Characters(String name, String image, String dateOfBirth, String gender, String house) {
        this.name = name;
        this.image = image;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.house = house;
    }

    public String getHouse() {
        return house;
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
}
