import java.util.Arrays;
import java.util.HashMap;

//Problem 350. Intersection of Two Arrays II
public class Problem350 {
    public int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> record = new HashMap<>();

        for(int i: nums1){
            if(record.containsKey(i)){
                record.put(i, record.get(i) + 1);
            }else{
                record.put(i, 1);
            }
        }
        int[] res = new int[0];
        int index = 0;
        for(int i : nums2){
            if(record.containsKey(i)){
                res = Arrays.copyOf(res, res.length + 1);
                res[index] = i;
                index++;
                record.put(i, record.get(i) - 1);
                if(record.get(i) == 0){
                    record.remove(i);
                }
            }

        }

        return res;
    }

}
