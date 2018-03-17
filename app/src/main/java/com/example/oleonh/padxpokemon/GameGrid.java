package com.example.oleonh.padxpokemon;

/**
 * Created by oleonh on 3/17/18.
 */

import java.util.*;

public class GameGrid {
    int[][] ground;
    boolean[][] playerlocation;
    final private int ROCK = 2;
    final private int GRASS = 1;
    final private int GROUND = 0;
    int playerX;
    int playerY;
    ArrayList<Pokemon> allPokemon = new ArrayList<>();

    public GameGrid(){
        int[][] ground = new int[20][20];
        for (int i = 0; i < 20; i++){
           for (int j = 0; j < 20; j++){
                 if (i < 7){
                     if(j == 0 || j == 19) {
                         ground[i][j] = ROCK;
                     }else{
                         ground[i][j] = GRASS;
                     }
                 }else{
                     ground[i][j] = GROUND;
                 }
            }
        }
        allPokemon.add(new Pokemon(10, 10, 10, "dark", "OG"));
        playerX = 10;
        playerY = 10;
    }

    void runIntoPokemon(){
        if(isInGrass()){
            if(Math.random() <= .25){
                fightRandomPokemon();
            }
        }
    }

    void fightRandomPokemon(){

    }


    void playerMove(int x1, int y1){
        playerX = x1; playerY = y1;
    }

    boolean isInGrass(){
        if(ground[playerX][playerY] == GRASS){
            return true;
        }
        return false;
    }

}