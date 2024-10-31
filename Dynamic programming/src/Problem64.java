public class Problem64 {
    public int minPathSum(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;


        int[][] sumGrid = new int[row][col];
        for (int r = row - 1; r >= 0; r--){
            for (int c = col - 1; c >=0; c--){
                if (r == row - 1 && c != col - 1 ){
                    sumGrid[r][c] = grid[r][c] + sumGrid[r][c+1];
                }else if( c == col - 1 && r != row - 1){
                    sumGrid[r][c] = grid[r][c] + sumGrid[r+1][c];
                } else if (r != row -1 && c!= c-1) {
                    sumGrid[r][c] = grid[r][c] + Math.min(sumGrid[r+1][c], sumGrid[r][c+1]);
                }else {
                    sumGrid[r][c] = grid[r][c];
                }
            }
        }

        return sumGrid[0][0];
    }
}
