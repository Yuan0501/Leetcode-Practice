public class Problem79 {
    int row;
    int col;
    boolean[][] visited;
    public boolean exist(char[][] board, String word){
        row = board.length;
        col = board[0].length;
        visited = new boolean[row][col];
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(dfs(board, word, 0, r, c)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int r, int c){
        if(index == word.length()){
            return true;
        }
        if(r < 0 || r >= row || c < 0 || c >= col || visited[r][c] || board[r][c] != word.charAt(index)){
            return false;
        }

        visited[r][c] = true;

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for(int i = 0; i < directions.length; i++){
            if(dfs(board, word, index + 1, r + directions[i][0], c + directions[i][1])){
                return true;
            }
        }
        visited[r][c] = false;
        return false;
    }
}
