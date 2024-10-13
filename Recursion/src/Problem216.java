import java.util.ArrayList;
import java.util.List;

public class Problem216 {
    private void generateCombination(int k , int remain, List<Integer> curList, int startNum, List<List<Integer>> res){
        if(remain == 0 && curList.size() == k){
            res.add(new ArrayList<>(curList));
            return;
        }

        if(remain < 0 && curList.size() == k){
            return;
        }

        for(int i = startNum; i <= 9; i++){
            curList.add(i);
            remain -= i;

            generateCombination(k,remain,curList,i + 1, res);
            remain += curList.get(curList.size()-1);
            curList.remove(curList.size() - 1);
        }


    }
    public List<List<Integer>> combinationSum3(int k, int n){
        List<List<Integer>> res = new ArrayList<>();
        generateCombination(k, n, new ArrayList<>(), 1, res);
        return res;
    }
}
