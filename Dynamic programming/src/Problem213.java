import java.util.Arrays;

public class Problem213 {
    private int robHelper(int[] nums){
        int len = nums.length;
        int[] memo = new int[len];
        memo[len - 1] = nums[len - 1];
        for (int i = len - 2; i >= 0; i--){
            for (int j = i; j < len; j++){
                memo[i] = Math.max(memo[i], nums[j] + (j + 2 < len? memo[j + 2]:0));
            }
        }
        return memo[0];
    }
    public int rob(int[] nums){
        int len = nums.length;
        int rob1 = robHelper(Arrays.copyOfRange(nums, 0, len-1));
        int rob2 = robHelper(Arrays.copyOfRange(nums, 1, len));
        return Math.max(rob1, rob2);
    }
}
