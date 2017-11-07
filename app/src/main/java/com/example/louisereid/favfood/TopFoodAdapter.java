package com.example.louisereid.favfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by louisereid on 07/11/2017.
 */

public class TopFoodAdapter extends ArrayAdapter<Food> {

    public TopFoodAdapter(Context context, ArrayList<Food> foods){
        super(context, 0, foods);
    }

    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.food_list, parent, false);
        }
        Food currentFood = getItem(position);
        ImageView image = (ImageView) listItemView.findViewById(R.id.listImage);
        TextView ranking = (TextView) listItemView.findViewById(R.id.listRanking);
        ranking.setText(currentFood.getRanking().toString());
        TextView type = (TextView) listItemView.findViewById(R.id.listType);
        type.setText(currentFood.getType());

        listItemView.setTag(currentFood);

        return listItemView;
    }
}
