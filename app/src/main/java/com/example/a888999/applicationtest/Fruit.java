package com.example.a888999.applicationtest;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.List;

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name,int imageId)
    {
       this.name=name;
       this.imageId=imageId;
    }
    public String getName()
    {return name;}

    public int getImageId() {
        return imageId;
    }
}

