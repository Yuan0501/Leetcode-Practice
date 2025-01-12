import java.util.HashMap;
import java.util.HashSet;

public class Problem217 {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            if(set.contains(cur)){
                return true;
            }else{
                set.add(cur);
            }
        }
        return false;
    }
}
