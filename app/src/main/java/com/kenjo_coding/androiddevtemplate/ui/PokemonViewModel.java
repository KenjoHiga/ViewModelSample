package com.kenjo_coding.androiddevtemplate.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kenjo_coding.androiddevtemplate.model.Pokemon;

import java.util.List;


public class PokemonViewModel extends ViewModel {
    private static final String TAG = PokemonViewModel.class.getSimpleName();

    /** ポケモンリストの処理 */
    // 定義
    private MutableLiveData<List<Pokemon>> _pokemons = new MutableLiveData<>();

    // セット
    public void fetchPokemons() {
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




}