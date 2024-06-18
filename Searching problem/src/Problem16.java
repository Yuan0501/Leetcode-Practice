import java.util.Arrays;

public class Problem16 {
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int closestSum = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int curtarget = target - nums[i];
            int lo = i + 1;
            int hi = nums.length - 1;
            while (lo < hi){
                int curSum = nums[lo] + nums[hi];
                int curClose = Math.abs(curtarget - curSum);
                if(curClose < closest){
                    closest = curClose;
                    closestSum = nums[lo] + nums[hi] + nums[i];
                }
                if(curSum < curtarget){
                    lo++;
                } else{
                    hi--;
                }
            }
        }
        return closestSum;
    }
}
