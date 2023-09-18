package com.kenjo_coding.androiddevtemplate.model;

public class Pokemon {
    public Integer id;
    public String name;
    public String type;
    public Integer height;
    public Integer weight;

    static String execute(int i){
        if(i % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(i);
    }


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
        String BASE_URL = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
        return  BASE_URL + String.valueOf(id) + ".png";
    }

    public String getOfficialImageUrl() {
        String BASE_URL = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/";
        return  BASE_URL + String.valueOf(id) + ".png";
    }
}
