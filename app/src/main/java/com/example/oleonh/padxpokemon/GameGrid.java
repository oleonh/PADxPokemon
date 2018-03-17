package com.example.oleonh.padxpokemon;

/**
 * Created by oleonh on 3/17/18.
 */

public class GameGrid {
    int[][] ground;
    boolean[][] playerlocation;
    final private int ROCK = 2;
    final private int GRASS = 1;
    final private int GROUND = 0;
    int playerX;
    int playerY;


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
        playerX = 10;
        playerY = 10;
    }

    void playerMove(int x1, int y1){
        playerX = x1; playerY = y1;
    }

    public static int getArrayValue(int x, int y){
        return ground[x][y];
    }

}
