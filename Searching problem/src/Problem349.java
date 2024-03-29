// 349. Intersection of Two Arrays
//Time complexoty of insert, find and delete methods of HashSet in Java is O(1)
// Time complexity: O(n)


import java.util.HashSet;
import java.util.Set;

public class Problem349 {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
//        O(n)
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
//        O(n)
        Set<Integer> resSet = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                resSet.add(nums2[i]);
            }
        }
        int[] res = new int[resSet.size()];
        int i = 0;
        for(int item : resSet){
            res[i] = item;
            i++;
        }
        return res;


    }
}
