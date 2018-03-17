/**
 * Created by oleonh on 3/17/18.
 */

public class GameGrid {
    int[][] ground;
    boolean[][] playerlocation;

    public GameGrid(){
        int[][] ground = new int[20][20];
        for (int i = 0; i < 20; i++){
           for (int j = 0; j < 20; j++){
                 if (i < 7){
                     if(j == 0 || j == 19) {
                         ground[i][j] = 2;
                     }else{
                         ground[i][j] = 1;
                     }
                 }else{
                     ground[i][j] = 0;
                 }
            }
        }
    }
}
