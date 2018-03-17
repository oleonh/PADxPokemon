/**
 * Created by oleonh on 3/17/18.
 */

public class GameGrid {
    int[][] ground;
    boolean[][] playerlocation;
    final private int ROCK = 2;
    final private int GRASS = 1;
    final private int GROUND = 0;


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
    }
}
