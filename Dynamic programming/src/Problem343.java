public class Problem343 {
    private int breakInteger(int n){
        if(n == 1){
            return 1;
        }
        int res = -1;
        for (int i = 1; i < n; i++){
            res = max(i * breakInteger(n - i), res, i * (n - i));
        }

        return res;
    }


    private int max(int x, int y, int z){
        return Math.max(Math.max(x, y), z);
    }

    public int integerBreak(int n){
        return breakInteger(n);
    }
}
