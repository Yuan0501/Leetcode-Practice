import java.util.ArrayList;
import java.util.List;

public class Problem46 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){
        backtracking(nums, new ArrayList<>());
        return res;
    }

    public void backtracking(int[] nums, List<Integer> lst){
        if(lst.size() == nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!lst.contains(nums[i])){
                lst.add(nums[i]);
                backtracking(nums, lst);
                lst.remove(lst.size() - 1);
            }
        }

    }

}
