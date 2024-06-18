import java.util.HashMap;

// 1. Two Sum
public class Problem1 {
//    solution 1: brute force
    public int[] twoSum(int[] nums, int target){
        int[] res = new int[2];
        for(int i=0; i < nums.length; i++){
            int complete = target - nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] == complete){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return null;
    }
//    solution 2: use hashMap
    public int[] twoSum1(int[] nums, int target){
        int [] res = new int[2];
        HashMap<Integer, Integer> corespond = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            corespond.put(nums[i],i);
        }
        for(int i=0; i< nums.length; i++){
            int complete = target - nums[i];
            if(corespond.containsKey(complete) && corespond.get(complete)!= i){
                res[0] = i;
                res[1] = corespond.get(complete);
                return res;
            }
        }
        return null;
    }
}
