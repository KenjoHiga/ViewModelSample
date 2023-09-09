package com.kenjo_coding.androiddevtemplate.ui.legacy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kenjo_coding.androiddevtemplate.R;
import com.kenjo_coding.androiddevtemplate.model.Pokemon;

public class LegacyFragment extends Fragment {

    TextView textName;
    TextView textId;
    TextView textType;
    TextView textHeight;
    TextView textWeight;
    ImageView imagePokemon;
    Button buttonDisplay;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_legacy, container, false);

        // findViewByIdメソッドを用いてViewオブジェクトを取得
        textName = view.findViewById(R.id.textName);
        textId = view.findViewById(R.id.textId);
        textType = view.findViewById(R.id.textType);
        textHeight = view.findViewById(R.id.textHeight);
        textWeight = view.findViewById(R.id.textWeight);
        imagePokemon = view.findViewById(R.id.imageView);
        buttonDisplay = view.findViewById(R.id.buttonDisplay);

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // セットするデータオブジェクトを生成（今回はサンプルで準備）
        Pokemon pikachu = getPokemonData();

        // ボタン押下時にデータ表示
        buttonDisplay.setOnClickListener(v -> displayPokemonData(pikachu));
    }

    private void displayPokemonData(Pokemon pikachu) {
        // 取得したオブジェクトに値をセット
        textName.setText(pikachu.getName());
        textId.setText(String.valueOf(pikachu.getId()));
        textType.setText(pikachu.getType());
        textHeight.setText(String.valueOf(pikachu.getHeight()));
        textWeight.setText(String.valueOf(pikachu.getWeight()));
         imagePokemon.setImageResource(pikachu.getImageResourceId());
    }

    private Pokemon getPokemonData() {
        return new Pokemon(
                25,
                "ピカチュウ",
                0.40,
                6.0,
                "でんき",
                R.mipmap.image_pikachu_foreground
        );
    }
}