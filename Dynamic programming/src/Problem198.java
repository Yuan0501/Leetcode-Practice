public class Problem198 {
//    自底向上 recursive + 记忆化搜索

    int[] memo;
    private int trySearch(int[] nums, int index){
        int num = nums.length;

        if (index >= num){
            return 0;
        }
        if (memo[index] != 0){
            return memo[index];
        }
        int res = -1;
        for (int i = index; i < num ; i++){
            res = Math.max(nums[i] + trySearch(nums, i + 2), res);
        }
        memo[index] = res;
        return res;
    }
    public int rob(int[] nums){
        memo = new int[nums.length + 1];
        return trySearch(nums, 0);
    }

//    动态规划
    public int robI(int[] nums){
        int num = nums.length;
        int[] memo1 = new int[num];
        memo1[num - 1] = nums[num - 1];

        for (int i = num - 2; i >= 0; i--){
           for (int j = i; j < num; j++){
               memo1[i] = Math.max(nums[j] + (j + 2 >= num ? 0 : memo1[j + 2]), memo1[i]);
           }
        }
        return memo1[0];
    }
}
