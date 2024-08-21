import java.util.TreeSet;
//Time complexity : O(nlogn)
//space complexity: O(n)

public class Problem220 {
    public boolean containNearByAlmostDuplicate(int[] nums, int indexDiff, int valueDiff){
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            int low = nums[i] - valueDiff;
            int high = nums[i] + valueDiff;

            Integer result = set.ceiling(low);
            if(result != null && result <= high){
                return true;
            }

            set.add(nums[i]);
            if(set.size() == indexDiff + 1){
                set.remove(nums[i - indexDiff]);
            }
        }
        return false;
    }
}
