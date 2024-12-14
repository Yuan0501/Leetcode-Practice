public class Problem130 {
    public void solve(char[][] board){
        int row = board.length;
        int col = board[0].length;
        if(row <= 2 || col <= 2){
            return;
        }
        boolean[][] visited = new boolean[row][col];
        for( int c = 0; c < col; c++){
            if(board[0][c] == 'O'){
                dfs(board, visited, 0, c);
            }

            if(board[row - 1][c] == 'O'){
                dfs(board, visited, row - 1, c);
            }
        }

        for(int r = 0; r < row; r++){
            if(board[r][0] == 'O'){
                dfs(board, visited, r, 0);
            }

            if(board[r][col - 1] == 'O'){
                dfs(board, visited, r, col - 1);
            }
        }

        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(board[r][c] == '*'){
                    board[r][c] = 'O';
                }else if(board[r][c] == 'O'){
                    board[r][c] = 'X';
                }
            }
        }

    }

    public void dfs(char[][] board, boolean[][] visited, int r, int c){
        int[][] directions = {{0, 1}, {0, -1},{1, 0}, {-1, 0}};
        int row = board.length;
        int col = board[0].length;
        if(r < 0 || r >= row || c < 0 || c >= col || board[r][c] != 'O'){
            return;
        }
        visited[r][c] = true;
        board[r][c] = '*';
        for(int i = 0 ; i < 4; i++){
            int newRow = r + directions[i][0];
            int newCol = c + directions[i][1];
            dfs(board, visited, newRow, newCol);
        }

    }
}
