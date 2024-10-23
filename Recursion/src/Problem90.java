import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem90 {
    List<List<Integer>> res = new ArrayList<>();
    int length, curLength;
    private void backtrack(int first, List<Integer> curList, int[] nums){
        if(curList.size() == curLength){
            res.add(new ArrayList<>(curList));
            return;
        }

        for(int i = first; i < length; i++){
            if(i != first && nums[i] == nums[i - 1]){
                continue;
            }
            curList.add(nums[i]);
            backtrack(i + 1, curList, nums);
            curList.remove(curList.size() - 1);
        }
    }
    public List<List<Integer>> subsetWithDup(int[] nums){
        Arrays.sort(nums);
        length = nums.length;
        for(curLength = 0; curLength < length + 1; curLength++){
            List<Integer> curList = new ArrayList<>();
            backtrack(0, curList, nums);
        }

        return res;

    }
}
