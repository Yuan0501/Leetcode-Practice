import java.util.HashMap;

public class Problem454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        int res = 0;
        HashMap<Integer, Integer> twoSumCount = new HashMap<>();
        for(int i = 0; i < nums3.length; i++){
            for(int j = 0; j < nums4.length; j++){
                int curSum = nums3[i] + nums4[j];
                if(twoSumCount.containsKey(curSum)){
                    twoSumCount.put(curSum, twoSumCount.get(curSum) + 1);
                }else{
                    twoSumCount.put(curSum, 1);
                }
            }
        }

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                int otherSum = nums1[i] + nums2[j];
                if(twoSumCount.containsKey(0-otherSum)){
                    res += twoSumCount.get(0-otherSum);
                }
            }
        }
        return res;
    }
}
