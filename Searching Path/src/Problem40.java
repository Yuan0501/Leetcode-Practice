import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem40 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        Arrays.sort(candidates);
        backtracking(candidates, target, new ArrayList<>(), 0);
        return res;
    }

    public void backtracking(int[] candidates, int target, List<Integer> cur, int startIndex){
        if(target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i = startIndex; i < candidates.length; i++){
            if(i != startIndex && candidates[i - 1] == candidates[i]){
                continue;
            }
            if(candidates[i] <= target){
                cur.add(candidates[i]);
                backtracking(candidates, target - candidates[i], cur, i + 1);
                cur.remove(cur.size() - 1);
            }

        }
    }

}
