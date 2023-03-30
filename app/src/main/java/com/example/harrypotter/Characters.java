package com.example.harrypotter;

public class Characters {

    private String name , image , dateOfBirth;
    private String gender;

    public Characters(String name, String image, String dateOfBirth, String gender) {
        this.name = name;
        this.image = image;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
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
