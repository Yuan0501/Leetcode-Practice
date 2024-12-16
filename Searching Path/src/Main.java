import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Contest slu = new Contest();
//        int[] nums = {1, 1, 2, 1};
//        System.out.println(slu.countBeautifulSplits(nums));

        Problem93 slu = new Problem93();
        List<String> res = slu.restoreIpAddresses("25525511135");
        for( int i = 0 ; i < res.size(); i++){
            System.out.println(res.get(i));
        }

//        Problem695 slu = new Problem695();
//        int [][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
//                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                         {0,1,1,0,1,0,0,0,0,0,0,0,0},
//                         {0,1,0,0,1,1,0,0,1,0,1,0,0},
//                         {0,1,0,0,1,1,0,0,1,1,1,0,0},
//                         {0,0,0,0,0,0,0,0,0,0,1,0,0},
//                         {0,0,0,0,0,0,0,1,1,1,0,0,0},
//                         {0,0,0,0,0,0,0,1,1,0,0,0,0}};
//        int [][] grid = {{1,1,0,0,0}, {1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};

//        Problem547 slu = new Problem547();
//        int[][] isConnected = {{1,1,0}, {1,1,0},{0,0,1}};
//        System.out.println(slu.findCircleNum(isConnected));

//        Problem130 slu = new Problem130();
//        char[][] board = {{'X','O','X'}, {'O','X','O'}, {'X','O','X'}};
//        slu.solve(board);
//        for(int i = 0 ; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }

    }
}