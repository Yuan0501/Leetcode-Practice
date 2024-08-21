import java.util.HashMap;
//Time complexity:O(n)
//Space complexity: O(n)
public class Problem219 {
    public boolean containNearbyDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], 1);
            }
            if(map.size() >= k+1){
                map.remove(nums[i-k]);
            }
        }
        return false;

    }
}
