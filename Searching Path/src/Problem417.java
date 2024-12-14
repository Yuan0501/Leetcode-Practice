import java.util.ArrayList;
import java.util.List;

public class Problem417 {
    public List<List<Integer>> pacificAtlantic(int[][] heights){
        int row = heights.length;
        int col = heights[0].length;
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];

        for(int r = 0; r < row; r++){
            dfs(pacific, heights, Integer.MIN_VALUE, r, 0);
            dfs(atlantic, heights, Integer.MIN_VALUE, r, col - 1);
        }

        for(int c = 0; c < col; c++){
            dfs(pacific, heights, Integer.MIN_VALUE, 0, c);
            dfs(atlantic, heights, Integer.MIN_VALUE, row - 1, c);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(pacific[r][c] && atlantic[r][c]){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(r);
                    cur.add(c);
                    res.add(cur);
                }
            }
        }

        return res;
    }

    public void dfs(boolean[][] visited, int[][] heights, int height, int r, int c){
        int row = heights.length;
        int col = heights[0].length;
        if(r < 0 || r >= row || c < 0 || c >= col || visited[r][c] || heights[r][c] < height ){
            return;
        }
        visited[r][c] = true;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for(int i = 0; i < directions.length; i++){
            dfs(visited, heights, heights[r][c], r + directions[i][0], c + directions[i][1]);
        }
    }
}
