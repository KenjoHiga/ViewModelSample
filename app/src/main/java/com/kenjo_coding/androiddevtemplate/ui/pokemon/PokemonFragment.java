package com.kenjo_coding.androiddevtemplate.ui.pokemon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kenjo_coding.androiddevtemplate.R;
import com.kenjo_coding.androiddevtemplate.databinding.FragmentPokemonBinding;
import com.kenjo_coding.androiddevtemplate.model.Pokemon;

public class PokemonFragment extends Fragment {
    private FragmentPokemonBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // DataBinding用のインスタンスを生成
        binding = FragmentPokemonBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // セットするデータオブジェクトを生成（今回はサンプルで準備）
        Pokemon pikachu = getPokemonData();

        // ボタン押下時にデータ表示
        binding.buttonDisplay.setOnClickListener(v -> binding.setPokemon(pikachu));
    }

    private Pokemon getPokemonData() {
        return new Pokemon(25, "ピカチュウ", 0.40, 6.0, "でんき", R.mipmap.image_pikachu_foreground);
    }
}