import java.util.ArrayList;
import java.util.List;

public class Problem39 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        backtracking(candidates, target, 0, 0, new ArrayList<>());
        return res;
    }

    public void backtracking(int[] candidates, int target, int curSum, int index, List<Integer> cur){
        if(curSum == target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(curSum > target){
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(candidates[i] > target){
                continue;
            }
            curSum += candidates[i];
            cur.add(candidates[i]);
            backtracking(candidates, target, curSum, i , cur);
            curSum -= cur.get(cur.size() - 1);
            cur.remove(cur.size() - 1);

        }
    }
}
