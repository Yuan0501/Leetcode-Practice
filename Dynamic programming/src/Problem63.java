// Time complexity: O(m * n)
// Space complexity : O(1)
public class Problem63 {
    public int uniquePathWithObstacles(int[][] obstacleGrid){
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        for (int i = 0; i < row; i++){
            if (obstacleGrid[i][0] == 1){

                for (int j = i; j < row; j++){
                    obstacleGrid[j][0] = 0;
                }
                break;
            }else {
                obstacleGrid[i][0] = 1;
            }
        }

        for (int j = 0; j < col; j++){
            if (obstacleGrid[0][j] == 1){
                for (int z = j; z < col; z++){
                    obstacleGrid[0][z] = 0;
                }
                break;
            }else{
                obstacleGrid[0][j] = 1;
            }
        }

        for (int r = 1; r < row; r++){
            for (int c = 1; c < col; c++){
                if (obstacleGrid[r][c] == 1){
                    obstacleGrid[r][c] = 0;
                }else{
                    obstacleGrid[r][c] = obstacleGrid[r-1][c] + obstacleGrid[r][c-1];
                }
            }
        }

        return obstacleGrid[row-1][col-1];
    }
}
