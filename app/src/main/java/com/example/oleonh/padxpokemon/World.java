package com.example.oleonh.padxpokemon;

/**
 * Created by oleonh on 3/17/18.
 */

import android.graphics.*;

public class World {
    public World(){
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                if(GameGrid.getArrayValue(i, j) == 2){

                }else if(GameGrid.getArrayValue(i, j) == 1){

                }else{

                }
            }
        }
    }
}
