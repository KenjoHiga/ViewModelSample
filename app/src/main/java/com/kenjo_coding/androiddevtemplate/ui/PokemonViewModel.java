package com.kenjo_coding.androiddevtemplate.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.Gson;
import com.kenjo_coding.androiddevtemplate.model.Pokemon;
import com.kenjo_coding.androiddevtemplate.model.PokemonList;

import java.util.List;


public class PokemonViewModel extends ViewModel {
    private static final String TAG = PokemonViewModel.class.getSimpleName();

    /** ポケモンリストの処理 */
    // 定義
    private MutableLiveData<List<Pokemon>> _pokemons = new MutableLiveData<>();

    // セット
    public void fetchPokemons() {
        _pokemons.setValue(generatePokemons());
    }

    // 参照
    public LiveData<List<Pokemon>> getPokemons() {
        return _pokemons;
    }




    /** 選択したポケモンの処理 */

    // 定義
    private Pokemon targetPokemon;

    // セット
    public void setPokemon(Pokemon pokemon){
        this.targetPokemon = pokemon;
    }

    // 参照
    public Pokemon getTargetPokemon(){
        return targetPokemon;
    }

    private List<Pokemon> generatePokemons(){
        String pokemonJson = getPokemonJson();

        Gson gson = new Gson();
        //Gsonでパース
        List<Pokemon> pokemons = new Gson().fromJson(pokemonJson, PokemonList.class).getPokemons();

        return pokemons;
    }

    private String getPokemonJson() {
        return "{\n" +
                "  \"pokemons\": [\n" +
                "    {\n" +
                "      \"height\": 7,\n" +
                "      \"id\": 1,\n" +
                "      \"imageUrlDefault\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\",\n" +
                "      \"imageUrlOfficial\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png\",\n" +
                "      \"name\": \"bulbasaur\",\n" +
                "      \"weight\": 69\n" +
                "    },\n" +
                "    {\n" +
                "      \"height\": 10,\n" +
                "      \"id\": 2,\n" +
                "      \"imageUrlDefault\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png\",\n" +
                "      \"imageUrlOfficial\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png\",\n" +
                "      \"name\": \"ivysaur\",\n" +
                "      \"weight\": 130\n" +
                "    },\n" +
                "    {\n" +
                "      \"height\": 20,\n" +
                "      \"id\": 3,\n" +
                "      \"imageUrlDefault\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png\",\n" +
                "      \"imageUrlOfficial\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png\",\n" +
                "      \"name\": \"venusaur\",\n" +
                "      \"weight\": 1000\n" +
                "    },\n" +
                "    {\n" +
                "      \"height\": 6,\n" +
                "      \"id\": 4,\n" +
                "      \"imageUrlDefault\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png\",\n" +
                "      \"imageUrlOfficial\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png\",\n" +
                "      \"name\": \"charmander\",\n" +
                "      \"weight\": 85\n" +
                "    },\n" +
                "    {\n" +
                "      \"height\": 11,\n" +
                "      \"id\": 5,\n" +
                "      \"imageUrlDefault\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png\",\n" +
                "      \"imageUrlOfficial\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png\",\n" +
                "      \"name\": \"charmeleon\",\n" +
                "      \"weight\": 190\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }


}