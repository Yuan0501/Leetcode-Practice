//Time complexity: N*(3*l) N is number of cells in the board and l is length of word
//Space complexisty: 0(L)
public class Problem79 {
    int[][] d = {{-1, 0},{0, 1},{1, 0},{0,-1}};
    int rowLength;
    int columnLength;
    boolean [][] visited;

    private boolean inArea(int x, int y){
        return x >= 0 && x < rowLength && y >= 0 && y < columnLength;
    }
    private boolean searchWord(int x, int y, char[][] board, String word, int index){
        if(index == word.length()-1){
            if(board[x][y]== word.charAt(index)){
                return true;
            }
        }

        if(board[x][y] == word.charAt(index)){
            visited[x][y] = true;
            for(int i = 0; i < 4; i++){
                int newx = x + d[i][0];
                int newy = y + d[i][1];
                if(inArea(newx, newy)){
                    if(!visited[newx][newy]){
                        if(searchWord(newx,newy,board,word,index + 1)){
                            return true;
                        }
                    }
                }
            }
            visited[x][y] = false;
        }
        return false;
    }
    public boolean exist(char[][] board, String word){
        rowLength = board.length;
        columnLength = board[0].length;
        visited = new boolean[rowLength][columnLength];


        for (int i = 0; i < rowLength;i++){
            for(int j = 0; j < columnLength; j++){
                if(searchWord(i,j,board,word,0)){
                    return true;
                }
            }
        }

        return false;
    }
}
