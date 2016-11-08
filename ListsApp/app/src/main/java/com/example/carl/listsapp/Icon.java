package com.example.carl.listsapp;

/**
 * Created by Carl on 07/11/2016.
 */

public class Icon {

    private int image;
    private String description;

    public Icon(int image, String description)
    {
        this.image = image;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
