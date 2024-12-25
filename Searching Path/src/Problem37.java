public class Problem37 {
    boolean[][] rowUsed = new boolean[9][10];
    boolean[][] colUsed = new boolean[9][10];
    boolean[][] cubeUsed = new boolean[9][10];
    public void solveSudoku(char[][] board){


        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '0';
                    rowUsed[i][num] = true;
                    colUsed[j][num] = true;
                    cubeUsed[cudeNum(i,j)][num] = true;
                }
            }
        }
        backtrack(board, 0, 0);
    }

    public int cudeNum(int i, int j){
        int r = i / 3;
        int c = j / 3;
        return r * 3 + c;
    }

    public boolean backtrack(char[][] board, int r, int c){
        while (r < 9 && board[r][c] != '.'){
            if(c == 8){
                r = r + 1;
                c = 0;
            }else{
                c += 1;
            }
        }
        if(r == 9){
            return true;
        }

        for(int i = 1; i <= 9; i++){
            if(rowUsed[r][i] || colUsed[c][i] || cubeUsed[cudeNum(r,c)][i]){
                continue;
            }

            rowUsed[r][i] = true;
            colUsed[c][i] = true;
            cubeUsed[cudeNum(r, c)][i] = true;
            board[r][c] = (char) (i +'0');
            if(backtrack(board, r, c)){
                return true;
            }
            rowUsed[r][i] = false;
            colUsed[c][i] = false;
            cubeUsed[cudeNum(r, c)][i] = false;
            board[r][c] = '.';
        }
        return false;
    }
}
