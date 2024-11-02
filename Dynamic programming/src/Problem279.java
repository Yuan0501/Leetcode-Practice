public class Problem279 {
    int[] memo;
// 自顶向下，recursive + memory
    private int breakNum(int n){
        if(n == 0){
            return 0;
        }
        if (memo[n] != 0){
            return memo[n];
        }
        int num = n;
        for (int i = 1; n - i * i >= 0; i++){
            num = Math.min(num, breakNum(n - i * i));
        }
        memo[n] = num + 1;

        return num+1;
    }
    public int numSquares(int n){
        memo = new int[n+1];
        return breakNum(n);
    }

//    自底向上 动态规划
    public int numSquaresI(int n){
        int[] memo = new int[n+1];
        memo[0] = 0;
        for (int i = 1; i <= n; i++){
            int min = i;
          for (int j = 1; i - j*j >= 0; j++){
              min = Math.min(memo[i-j*j] + 1, min);
          }
          memo[i] = min;

        }

        return memo[n];
    }
}
