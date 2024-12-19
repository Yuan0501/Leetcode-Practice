import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class problem47 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums){
        boolean[] visited = new boolean[nums.length];
        backtracking(nums, new ArrayList<>(), visited);
        return res;
    }

    public void backtracking(int[] nums, List<Integer> lst, boolean[] visited){
        if(nums.length == lst.size()){
            res.add(new ArrayList<>(lst));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1] && !visited[i - 1]){
                continue;
            }
            if(visited[i]) {
                continue;
            }
            lst.add(nums[i]);
            visited[i] = true;
            backtracking(nums, lst, visited);
            visited[i] = false;
            lst.remove(lst.size() - 1);
        }
    }
}
