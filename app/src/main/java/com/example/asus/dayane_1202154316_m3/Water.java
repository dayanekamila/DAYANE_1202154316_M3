package com.example.asus.dayane_1202154316_m3;

/**
 * Created by ASUS on 24/02/2018.
 */

public class Water {
    String title, description, detail;
    int image;

    public Water(String title, String description, String detail, int image){
        this.title = title;
        this.description = description;
        this.detail = detail;
        this.image = image;
    }

    public  String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public String getDetail(){
        return detail;
    }

    public int getImage(){
        return image;
    }
}
