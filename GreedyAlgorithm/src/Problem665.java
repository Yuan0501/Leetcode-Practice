public class Problem665 {
    public boolean checkPossibility(int[] nums){
        if(nums.length == 1){
            return true;
        }
        int len = nums.length;
        int noDeCount = 0;
        int modify = 1;
        int pre = 0;
        for(int i = 1; i < len; i++){
            int cur = i;
            if(nums[cur] < nums[pre] && modify == 1){
                if(pre == 0){
                    nums[pre] = nums[cur];
                } else if (pre > 0 && nums[pre - 1] <= nums[cur]) {
                    nums[pre] = nums[pre-1];
                } else if (pre >0 && nums[pre - 1] > nums[cur]) {
                    nums[cur] = nums[pre];
                }
                modify--;
            } else if (nums[cur] < nums[pre]&& modify == 0) {
                noDeCount++;
            }
            pre = cur;
        }
        return noDeCount <= 0;
    }
}
