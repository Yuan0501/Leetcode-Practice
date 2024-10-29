public class Problem200 {
    private void dfs(char[][]grid, int r, int c){
        int row = grid.length;
        int column = grid[0].length;

        if(r < 0 || r >= row || c < 0 || c >= column || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid,r,c-1);
        dfs(grid, r, c+1);
    }
    public int numIslands(char[][] grid){
        int numIsland = 0;
        int row = grid.length;
        int column = grid[0].length;
        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                if(grid[r][c] == '1'){
                    numIsland++;
                    dfs(grid, r, c);
                }
            }
        }
        return numIsland;
    }
}
