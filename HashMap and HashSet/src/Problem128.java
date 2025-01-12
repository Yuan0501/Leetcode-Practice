import java.util.HashMap;

public class Problem128 {
    public int longestConsecutive(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(nums, 0) + 1);
        }

        int seq;
        int max = 0;
        for(int cur : map.keySet()){
            if(!map.containsKey(cur - 1)){
                seq = 0;
                while (map.containsKey(cur)){
                    seq++;
                    cur++;
                }
                max = Math.max(max, seq);
            }
        }
        return max;
    }
}
