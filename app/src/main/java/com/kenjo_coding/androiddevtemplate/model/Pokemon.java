package com.kenjo_coding.androiddevtemplate.model;

public class Pokemon {
    private int id;
    private String name;
    private double height;
    private double weight;
    private String type;

    private int imageResourceId;

    public Pokemon(int id, String name, double height, double weight, String type, int imageResourceId) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.type = type;
        this.imageResourceId = imageResourceId;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
