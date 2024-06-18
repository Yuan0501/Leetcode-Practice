import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem18 {
    public List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        return kSum(nums, target, 0, 3);
    }

    public List<List<Integer>> kSum(int[] nums, int target, int start, int k){
        List<List<Integer>> res = new ArrayList<>();
        if(start == nums.length){
            return res;
        }
        long average = target / k ;
        if(nums[start] > average || nums[nums.length-1] < average){
            return  res;
        }

        if( k == 2){
            return twoSum(nums, target, start);
        }
        for(int i = start; i < nums.length; i++){
            if(i == start || nums[i - 1] != nums[i]){
                List<List<Integer>> subSets = kSum(nums, target-nums[i], i+1, k-1);
                for(List<Integer> subSet:subSets){
                    List<Integer> newSet = new ArrayList<>();
                    newSet.add(nums[i]);
                    newSet.addAll(subSet);
                    res.add(newSet);
                }
            }
        }
        return res;
    }

    public List<List<Integer>> twoSum(int[] nums, int target, int start){
        List<List<Integer>> res = new ArrayList<>();
        int high = nums.length - 1;
        int lo = start;
        while(lo < high){
            int curSum = nums[lo] + nums[high];
            if(curSum < target || (lo > start && nums[lo - 1] == nums[lo])){
                lo++;
            } else if (curSum > target || (high < nums.length - 1 && nums[high + 1] == nums[high])) {
                high--;
            }else{
                res.add(Arrays.asList(nums[lo], nums[high]));
                lo++;
                high--;
            }
        }
        return res;
    }
}
