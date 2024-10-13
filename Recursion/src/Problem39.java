import java.util.ArrayList;
import java.util.List;

public class Problem39 {
    private void generateCombation(int[] candidates, int target, int curSum, int startIndex, List<Integer> cur, List<List<Integer>> res){
        if(curSum == target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(curSum > target){
            return;
        }

        for(int i = startIndex; i < candidates.length; i++){
            cur.add(candidates[i]);
            curSum += candidates[i];
            generateCombation(candidates, target, curSum, i, cur, res);
            curSum -= cur.get(cur.size() - 1);
            cur.remove(cur.size() - 1);

        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        generateCombation(candidates, target, 0, 0, new ArrayList<>(), res);
        return res;
    }
}
