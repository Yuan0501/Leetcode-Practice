import java.util.HashMap;

public class Problem1 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(!map.isEmpty() && map.containsKey(target - cur)){
                res[0] = i;
                res[1] = map.get(target - cur);
            }
            map.put(cur, i);

        }
        return res;
    }
}
