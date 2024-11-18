public class Problem53 {
    public int maxSubArray(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int preSum = nums[0];
        int maxSum = preSum;
        for (int i = 1; i < nums.length; i++){
            if(preSum > 0){
                preSum = preSum + nums[i];
            }else {
                preSum = nums[i];
            }
            maxSum = Math.max(maxSum, preSum);
        }
        return maxSum;
    }
}
