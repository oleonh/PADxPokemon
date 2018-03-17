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

    private GameGrid grid;

    public World(){
        grid = new GameGrid();
        array = new ImageView[WIDTH][HEIGHT];
        for(int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (grid.getArrayValue(i, j) == 2) {

                } else if (grid.getArrayValue(i, j) == 1) {

                } else {

                }
            }
        }
        initialize();
    }

    private void initialize(){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if(GameGrid.getArrayValue(i, j) == 2){

<<<<<<< HEAD
                }else if(GameGrid.getArrayValue(i, j) == 1){

                }else{

                }
            }
        }
    }

=======
            }
        }
    }
>>>>>>> origin/master
}
