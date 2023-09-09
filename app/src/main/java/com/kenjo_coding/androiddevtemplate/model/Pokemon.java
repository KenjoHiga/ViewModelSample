package com.kenjo_coding.androiddevtemplate.model;

public class Pokemon {
    public Integer id;
    public String name;
    public String type;
    public Integer height;
    public Integer weight;


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

    public String getDefaultImageUrl() {
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" +
                String.valueOf(id) + ".png";
    }

    public String getOfficialImageUrl() {
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" +
                String.valueOf(id) + ".png";
    }
}
