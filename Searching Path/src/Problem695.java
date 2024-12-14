import java.util.Stack;

public class Problem695 {
// using iterative method and stack to implement
    public int maxAreaOfIsland(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1,0}};
        Stack<int[]> stack = new Stack<>();
        boolean[][] visited = new boolean[row][col];
        int numArea = 0;
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == 1 && !visited[r][c]){
                    int curArea = 0;

                    stack.push(new int[]{r, c});
                    visited[r][c] = true;
                    while (!stack.isEmpty()){
                        int[] node = stack.pop();
                        int rnode = node[0];
                        int cnode = node[1];
                        curArea++;
                        for(int i = 0; i < directions.length; i++){
                            int newrow = rnode + directions[i][0];
                            int newcol = cnode + directions[i][1];

                            if(newrow >= 0 && newrow < row && newcol >= 0 && newcol < col && grid[newrow][newcol] == 1 && !visited[newrow][newcol]){
                                stack.push(new int[]{newrow, newcol});
                                visited[newrow][newcol] = true;
                            }
                        }
                    }
                    numArea = Math.max(numArea, curArea);
                }
            }
        }

        return numArea;

    }

//    using recursive to implement
    public int maxAreaOfIslandRecur(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(grid[r][c] == 1){
                    maxArea = Math.max(maxArea,dfs(grid, r, c) );
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int r, int c){
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1,0}};
        int numArea = 0;
        int row = grid.length;
        int col = grid[0].length;
        if(r < 0 || r >= row || c < 0 || c >= col || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        numArea++;

        for(int i = 0 ; i < directions.length; i++){
            numArea += dfs(grid, r + directions[i][0], c + directions[i][1]);
        }
        return numArea;
    }
}
