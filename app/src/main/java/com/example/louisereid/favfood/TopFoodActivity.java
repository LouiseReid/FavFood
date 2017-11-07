package com.example.louisereid.favfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TopFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_food);

        TopFood topFood = new TopFood();
        ArrayList<Food> foodList = topFood.getList();

        TopFoodAdapter topFoodAdapter = new TopFoodAdapter(this, foodList);
        ListView listView = (ListView)findViewById(R.id.food_list);
        listView.setAdapter(topFoodAdapter);

    }

    public void getFood(View listItem){
        Food food = (Food) listItem.getTag();
        Intent i = new Intent(this, FoodActivity.class);
        i.putExtra("ranking", food.getRanking());
        i.putExtra("type", food.getType());
        startActivity(i);

    }
}
