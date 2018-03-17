package com.example.oleonh.padxpokemon;

/**
 * Created by oleonh on 3/17/18.
 */

import android.graphics.*;
import android.media.Image;
import android.widget.ImageView;

public class World {
    private final int WIDTH = 20;
    private final int HEIGHT = 20;
    private ImageView[][] array;
    private ImageView one;
    private ImageView two;
    private ImageView three;

    public World(){
        array = new ImageView[WIDTH][HEIGHT];
        initialize();
    }

    private void initialize(){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){

            }
        }
    }

}
