import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums){
         List<List<Integer>> res = new ArrayList<>();
         Arrays.sort(nums);
         for(int i = 0; i < nums.length && nums[i] <= 0; i++){
             if( i == 0 || nums[i-1] != nums[i]){
                 int j = i + 1;
                 int z = nums.length -1;
                 for(;j<z;){
                     if(nums[j] + nums[z] < -nums[i]){
                         j++;
                     } else if (nums[j] + nums[z] > -nums[i]) {
                         z--;
                     }else{
                         res.add(Arrays.asList(nums[i],nums[j],nums[z]));
                         j++;
                         z--;
                         while (j<z && nums[j-1] == nums[j]){
                             j++;
                         }
                     }
                 }
             }
         }

         return res;
    }
}
