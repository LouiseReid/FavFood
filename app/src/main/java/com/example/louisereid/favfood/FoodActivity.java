package com.example.louisereid.favfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    private TextView ranking;
    private TextView type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_item);

        ranking = (TextView)findViewById(R.id.itemRanking);
        type = (TextView)findViewById(R.id.itemType);

        Intent i = getIntent();
        Bundle extras = i.getExtras();

        String rankingString = extras.get("ranking").toString();
        String typeString = extras.get("type").toString();

        ranking.setText(rankingString);
        type.setText(typeString);
    }
}
