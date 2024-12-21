import java.util.ArrayList;
import java.util.List;

public class Problem78 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
       for(int size = 0; size <= nums.length; size++){
           backtracking(nums, new ArrayList<>(), size, 0);
       }

        return res;
    }

    public void backtracking(int[] nums, List<Integer> cur, int size, int index){
        if(cur.size() == size){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = index; i < nums.length; i++){
            cur.add(nums[i]);
            backtracking(nums, cur, size, i + 1);
            cur.remove(cur.size() - 1);
        }
    }
}
