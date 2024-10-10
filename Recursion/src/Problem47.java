import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem47 {
    public void helper(int[] nums, HashMap<Integer, Integer> map, List<Integer> lst, List<List<Integer>> res){
        if(lst.size() == nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }

        for(Map.Entry<Integer, Integer> cur : map.entrySet()){
            int num = cur.getKey();
            int count = cur.getValue();

            if(count == 0){
                continue;
            }
            lst.add(num);
            int curCount = count-1;
            map.put(num,curCount);
            helper(nums, map,lst, res);
            lst.remove(lst.size()-1);
            map.put(num, count);


        }



    }
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else{
                map.put(num, 1);
            }
        }
        helper(nums, map, new ArrayList<>(), res);
        return res;
        
    }
}
