public class Problem108 {
    public TreeNode sortedArrayToBST(int[] nums){
        int len = nums.length;
        return addNode(nums, 0, len-1);
    }

    public TreeNode addNode(int[] nums, int start, int end){
      if(start > end){
          return null;
      }
      int mid = (end + start) / 2;
      TreeNode root = new TreeNode(nums[mid]);
      TreeNode left = addNode(nums, start, mid-1);
      TreeNode right = addNode(nums, mid+1, end);
      root.left = left;
      root.right = right;
      return root;


    }
}
