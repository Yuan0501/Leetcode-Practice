import java.util.ArrayList;
import java.util.List;

public class Problem417 {


    private void dfs(boolean[][] visited, int[][] matrix, int height, int r, int c){
        int[][] dic = {{0, 1},{0, -1},{1, 0},{-1, 0}};
        if(r < 0 || r >= matrix.length || c < 0 || c >= matrix[0].length || visited[r][c] || matrix[r][c] < height){
            return;
        }
        visited[r][c] = true;
        for(int[] d : dic){
            dfs(visited, matrix, matrix[r][c], r+d[0], c + d[1]);
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights){
        List<List<Integer>> res = new ArrayList<>();
        int row = heights.length;
        int col = heights[0].length;
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atantic = new boolean[row][col];

        for(int r = 0; r < row; r++){
            dfs(pacific, heights, Integer.MIN_VALUE, r, 0);
            dfs(atantic, heights, Integer.MIN_VALUE, r, col - 1);
        }

        for(int c = 0; c < col; c++){
            dfs(pacific, heights, Integer.MIN_VALUE, 0, c);
            dfs(atantic, heights, Integer.MIN_VALUE, row - 1, c);
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if(pacific[i][j] && atantic[i][j]){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(i);
                    cur.add(j);
                   res.add(cur);
                }
            }
        }

        return res;

    }
}
