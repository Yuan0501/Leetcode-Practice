public class Problem343 {
//    自顶向下+记忆化搜索
    int[] memo;
    private int breakInteger(int n){
        if(n == 1){
            return 1;
        }
        if(memo[n] != 0){
            return memo[n];
        }
        int res = -1;
        for (int i = 1; i < n; i++){
            res = max(i * breakInteger(n - i), res, i * (n - i));
        }

        memo[n] = res;

        return res;
    }


    private int max(int x, int y, int z){
        return Math.max(Math.max(x, y), z);
    }

    public int integerBreak(int n){
        memo = new int[n+1];
        return breakInteger(n);
    }

//    动态规划 自底向上解决问题
    public int integerBreakI(int n){
       int[] memo = new int[n + 1];
       for (int i = 2; i <= n; i++){
           for (int j = 1; j <= i-1; j++){
               memo[i] = max(j*(i-j), j * memo[i-j], memo[i]);
           }
       }
       return memo[n];
    }
}
