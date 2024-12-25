import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem51 {

    char[][] nQueens;
    boolean[] colUsed;
    boolean[] diag45Used;
    boolean[] diag135Used;
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n){
        nQueens = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(nQueens[i], '.');
        }
        colUsed = new boolean[n];
        diag45Used = new boolean[2 * n - 1];
        diag135Used = new boolean[2 * n - 1];
        backtracking(0, n);
        return res;
    }

    public void backtracking(int row, int n){
        if(row == n){
            List<String> cur = new ArrayList<>();
            for(char[] queen : nQueens){
                cur.add(new String(queen));
            }
            res.add(cur);
            return;
        }

        for(int col = 0; col < n; col++){
            if(colUsed[col] || diag45Used[row + col] || diag135Used[n - 1 - (row - col)]){
                continue;
            }
            nQueens[row][col] = 'Q';
            colUsed[col] = true;
            diag45Used[row + col] = true;
            diag135Used[n - 1 - (row - col)] = true;
            backtracking(row + 1, n);
            nQueens[row][col] = '.';
            colUsed[col] = false;
            diag45Used[row + col] = false;
            diag135Used[n - 1 - (row - col)] = false;
        }
    }
}
