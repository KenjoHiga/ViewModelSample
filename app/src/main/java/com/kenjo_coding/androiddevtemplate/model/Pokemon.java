package com.kenjo_coding.androiddevtemplate.model;

public class Pokemon {
    public Integer id;
    public String name;
    public Integer height;
    public Integer weight;
    public String imageUrlDefault;
    public String imageUrlOfficial;

    /** getter */
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getImageUrlDefault() {
        return imageUrlDefault;
    }

    public String getImageUrlOfficial() {
        return imageUrlOfficial;
    }
}
