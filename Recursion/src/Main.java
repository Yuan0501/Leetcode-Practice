import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},{'O','O','O','X'},{'X','O','O','X'},{'X','X','X','X'}};
        Problem130 slu = new Problem130();
        slu.solve(board);
        for (int i = 0 ; i < 4; i++){
            System.out.println();
            for (int j = 0; j < 4; j++){
                System.out.print(board[i][j] + " ");
            }
        }


    }
}