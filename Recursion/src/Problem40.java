import java.util.*;

public class Problem40 {
    private void generateCombination(int[] candidates, int target,int startIndex, List<Integer> curList, int curSum, List<List<Integer>> res){
        if(curSum == target){
            res.add(new ArrayList<>(curList));
            return;
        }
        if(curSum > target){
            return;
        }

        for(int i = startIndex; i < candidates.length; i++){
            if(i > startIndex && candidates[i] == candidates[i - 1]){
                continue;
            }
            curList.add(candidates[i]);
            curSum += candidates[i];

            generateCombination(candidates, target, i + 1, curList,curSum, res);
            curSum -= curList.get(curList.size() - 1);
            curList.remove(curList.size() - 1);

        }


    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        generateCombination(candidates, target, 0, new ArrayList<>(),0, res);
        return res;
    }
}
