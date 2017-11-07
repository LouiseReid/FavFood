package com.example.louisereid.favfood;

import android.widget.ImageView;

/**
 * Created by louisereid on 07/11/2017.
 */

public class Food {

    private int image;
    private int ranking;
    private String type;


    public Food(Integer image, int ranking, String type) {
        this.image = image;
        this.ranking = ranking;
        this.type = type;
    }

    public Integer getImage() {
        return image;
    }

    public Integer getRanking() {
        return ranking;
    }


    public String getType() {
        return type;
    }

}
