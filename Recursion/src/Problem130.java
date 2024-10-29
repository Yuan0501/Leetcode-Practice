public class Problem130 {
    public void solve(char[][] board){
        if(board.length == 0 || board == null){
            return;
        }
        if(board.length < 2 || board[0].length < 2){
            return;
        }

        int row = board.length;
        int col = board[0].length;

        for(int r = 0; r < row; r++){
            if(board[r][0] == 'O'){
                dfs(board, r, 0);
            }
            if(board[r][col - 1] == 'O'){
                dfs(board,r, col - 1);
            }
        }

        for(int c = 0; c < col; c++){
            if(board[0][c] == 'O'){
                dfs(board, 0, c);
            }

            if(board[row - 1][c] == 'O'){
                dfs(board, row - 1, c);
            }
        }

        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }

                if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }
            }
        }

    }

    private void dfs(char[][] board, int r, int c){
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length){
            return;
        }

        if(board[r][c] == 'O'){
            board[r][c] = '*';
        }

        if(r > 1 && board[r-1][c] == 'O'){
            dfs(board, r-1, c);
        }

        if(r < board.length - 2 && board[r+1][c] == 'O'){
            dfs(board, r+1, c);
        }

        if(c > 1 && board[r][c - 1] == 'O'){
            dfs(board, r, c-1);
        }

        if(c < board[0].length - 2 && board[r][c + 1] == 'O'){
            dfs(board, r, c+1);
        }

    }
}
