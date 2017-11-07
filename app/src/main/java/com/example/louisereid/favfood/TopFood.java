package com.example.louisereid.favfood;

import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by louisereid on 07/11/2017.
 */

public class TopFood {

    private ArrayList<Food> list;

    public TopFood(){
        list = new ArrayList<Food>();
        list.add(new Food(R.drawable.pizza ,1, "Pepperoni Pizza"));
        list.add(new Food(R.drawable.taco, 2, "Taco"));
        list.add(new Food(R.drawable.macaroni, 3, "Macaroni"));
        list.add(new Food(R.drawable.pie, 4, "Scotch Pie"));
        list.add(new Food(R.drawable.burger, 5, "Beef Burger"));
        list.add(new Food(R.drawable.nachos, 6, "Nachos"));
        list.add(new Food(R.drawable.curry, 7, "Chicken Tika Masala"));
        list.add(new Food(R.drawable.haggis, 8, "Haggis"));
        list.add(new Food(R.drawable.cheesypuffs, 9, "Cheesy Puffs"));
        list.add(new Food(R.drawable.jelly, 10, "Jelly"));
    }

    public ArrayList<Food> getList() {
        return new ArrayList<Food>(list);
    }
}
