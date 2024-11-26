public class Problem34 {
    public int[] searchRange(int[] nums, int target){
       int first = findFirst(nums, target);
       int last = findFirst(nums, target + 1) - 1;
       if(first == nums.length || nums[first] != target){
           return new int[]{-1, -1};
       }
       return new int[] {first, last};

    }

    public int findFirst(int[] nums, int target){
        int l = 0;
        int h = nums.length;
        while (l < h){
            int mid = l + (h - l) / 2;
            if(nums[mid] >= target){
                h = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}
