import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Problem1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1) {
            return -1;
        }
        int[][] direction = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        Queue<int[]> queue = new ArrayDeque<>();
        grid[0][0] = 1;
        queue.add(new int[]{0, 0});
        int distance = 0;
        while (!queue.isEmpty()) {
            int[] node = queue.remove();
            for (int[] d : direction) {
                int neighborRow = node[0] + d[0];
                int neighborCol = node[1] + d[1];
                if (neighborRow == row - 1 && neighborCol == col - 1) {
                    return distance + 1;
                }
                if (neighborRow >= 0 && neighborRow < row && neighborCol >= 0 && neighborCol < col && grid[neighborRow][neighborCol] == 0) {
                    queue.add(new int[]{neighborRow, neighborCol});
                    distance += 1;
                }
            }
        }

        return -1;
    }


}
