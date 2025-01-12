import java.util.HashMap;

public class Problem594 {
    public int findLHS(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            }else {
                map.put(n, 1);
            }
        }
        int max = 0;
        for(int cur : map.keySet()){
            if(map.containsKey(cur + 1)){
                int count = map.get(cur) + map.get(cur + 1);
                max = Math.max(max, count);
            }
        }

        return max;
    }
}
