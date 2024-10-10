import java.util.ArrayList;
import java.util.List;

public class Problem46 {

    private void helper(int[] nums, List<Integer> lst, List<List<Integer>> res){
        if(lst.size() == nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int num : nums){
            if(!lst.contains(num)){
                lst.add(num);
                helper(nums, lst, res);
                lst.remove(lst.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, new ArrayList<>(), res);
        return res;
    }
}
